package config;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;

import config.constants.BROWSER;
import config.constants.CLOUD_ENVS;
import config.constants.EXECUTION;
import config.constants.GRID_ENVS;

import com.microsoft.playwright.Playwright;

/**
 * Centralizes Playwright browser configuration and execution mode.
 *
 * <p>
 * This class defines how browsers are provisioned depending on the selected execution type:
 * </p>
 *
 * <ul>
 *   <li><b>LOCAL</b> – browsers are launched on the host machine</li>
 *   <li><b>GRID</b> – browsers are connected through a Playwright WebSocket endpoint</li>
 *   <li><b>CLOUD</b> – connection to SaaS browser providers or hosted Playwright services</li>
 * </ul>
 *
 * <p>
 * It acts as the single entry point for browser creation and is typically used by
 * {@code PlaywrightManager} when running thread-local test execution.
 * </p>
 *
 * @author Lucas Alexandre Bez
 * @since 1.0.0
 */
public class Properties {

    /** Generic flags for local browser launch. */
    private static final boolean headless = true;
    private static final boolean chromiumSandbox = false;
    private static final double slowMoMs = 100;
    private static final double timeout = 60_000;

    /** Browser selected for execution. */
    public static final BROWSER selectedBrowser = BROWSER.FIREFOX;

    /** Execution type: LOCAL, GRID or CLOUD. */
    public static final EXECUTION executionType = EXECUTION.LOCAL;

    /**
     * WebSocket endpoint for Playwright Grid / remote service.
     *
     * <p>Example (adjust as required): {@code ws://localhost:4444/playwright}</p>
     */
    private static final String GRID_WS_ENDPOINT = GRID_ENVS.ENV2.getUrl();

    /**
     * WebSocket endpoint for cloud providers (e.g., BrowserStack, LambdaTest, etc.).
     */
    private static final String CLOUD_WS_ENDPOINT = CLOUD_ENVS.ENV1.getUrl();

    /** Utility class — prevent instantiation. */
    private Properties() {}

    /**
     * Creates a {@link Browser} for the current execution mode.
     *
     * @param playwright the thread-local Playwright instance
     * @return configured browser instance
     */
    public static Browser setBrowser(Playwright playwright) {
        switch (executionType) {
            case LOCAL:
                return createLocalBrowser(playwright);
            case GRID:
                return createRemoteBrowser(playwright, GRID_WS_ENDPOINT);
            case CLOUD:
                return createRemoteBrowser(playwright, CLOUD_WS_ENDPOINT);
            default:
                throw new IllegalStateException("Unexpected execution type: " + executionType);
        }
    }

    /* ===================== LOCAL ===================== */

    /**
     * Defines launch options applied to locally launched browsers.
     *
     * @return launch configuration
     */
    private static LaunchOptions commonLaunchOptions() {
        return new LaunchOptions()
                .setHeadless(headless)
                .setTimeout(timeout)
                .setSlowMo(slowMoMs);
    }

    /**
     * Launches a local browser according to the {@link BROWSER} selection.
     */
    private static Browser createLocalBrowser(Playwright playwright) {
        LaunchOptions options = commonLaunchOptions();

        switch (selectedBrowser) {
            case CHROMIUM:
                return playwright.chromium().launch(options.setChromiumSandbox(chromiumSandbox));

            case CHROME:
                options.setChannel("chrome");
                return playwright.chromium().launch(options.setChromiumSandbox(chromiumSandbox));

            case CHROME_BETA:
                options.setChannel("chrome-beta");
                return playwright.chromium().launch(options);

            case CHROME_DEV:
                options.setChannel("chrome-dev");
                return playwright.chromium().launch(options);

            case CHROME_CANARY:
                options.setChannel("chrome-canary");
                return playwright.chromium().launch(options);

            case EDGE:
                options.setChannel("msedge");
                return playwright.chromium().launch(options);

            case EDGE_BETA:
                options.setChannel("msedge-beta");
                return playwright.chromium().launch(options);

            case EDGE_DEV:
                options.setChannel("msedge-dev");
                return playwright.chromium().launch(options);

            case EDGE_CANARY:
                options.setChannel("msedge-canary");
                return playwright.chromium().launch(options);

            case FIREFOX:
                return playwright.firefox().launch(options);

            case WEBKIT:
                return playwright.webkit().launch(options);

            case CUSTOM:
                return playwright.chromium().launch(options);

            default:
                return playwright.chromium().launch(options);
        }
    }

    /* ===================== REMOTE (GRID / CLOUD) ===================== */

    /**
     * Connects to a remote Playwright service via WebSocket endpoint.
     *
     * <p>
     * Can be used for:
     * </p>
     *
     * <ul>
     *   <li>Playwright Grid</li>
     *   <li>self-hosted remote browsers</li>
     *   <li>cloud testing providers</li>
     * </ul>
     *
     * @param playwright Playwright instance
     * @param wsEndpoint WebSocket URL
     * @return connected browser instance
     */
    private static Browser createRemoteBrowser(Playwright playwright, String wsEndpoint) {
        try {
            BrowserType type;
            switch (selectedBrowser) {
                case FIREFOX:
                    type = playwright.firefox();
                    break;
                case WEBKIT:
                    type = playwright.webkit();
                    break;
                default:
                    type = playwright.chromium();
            }
            return type.connect(wsEndpoint);
        } catch (Exception e) {
            throw new IllegalStateException(
                    "Failed to connect to remote Playwright endpoint: " + wsEndpoint,
                    e
            );
        }
    }
}
