package bases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

import config.PlaywrightManager;

/**
 * Base configuration class for Playwright tests.
 *
 * <p>
 * This class is responsible for:
 * </p>
 * <ul>
 *   <li>obtaining a thread-local {@link Browser} instance from {@link PlaywrightManager}</li>
 *   <li>creating a new {@link BrowserContext} for each test</li>
 *   <li>creating a new {@link Page} per test</li>
 *   <li>navigating to the base URL before each test</li>
 *   <li>releasing thread-local Playwright/Browser resources after the test suite finishes</li>
 * </ul>
 *
 * <p>
 * Extend this class to reuse Playwright setup logic in test bases.
 * Subclasses can override hooks such as {@link #contextOptions()} or {@link #baseUrl()}
 * to adapt the configuration for different environments (desktop, mobile, etc.).
 * </p>
 *
 * @author Lucas Alexandre Bez
 * @since 1.0.0
 */
public abstract class TestBaseConfig {

	protected BrowserContext context;
    protected Page page;

    protected TestBaseConfig() {}

    /**
     * Provides the {@link Browser.NewContextOptions} used when creating a new
     * {@link BrowserContext} for each test.
     *
     * <p>
     * Subclasses may override this method to customize, for example:
     * </p>
     * <ul>
     *   <li>locale</li>
     *   <li>viewport size</li>
     *   <li>permissions</li>
     *   <li>geolocation</li>
     *   <li>storage state</li>
     * </ul>
     *
     * @return the configured {@link Browser.NewContextOptions}
     */
    protected abstract Browser.NewContextOptions contextOptions();

    /**
     * Defines the base URL used for navigation before each test.
     *
     * <p>
     * Subclasses may override this method to point to different applications
     * or environments (e.g. staging, production, etc.).
     * </p>
     *
     * @return base URL string
     */
    protected String baseUrl() {
        return "https://demoqa.com";
    }

    /**
     * Creates a new {@link BrowserContext} and {@link Page} before every test
     * and navigates to the configured base URL.
     */
    @BeforeEach
    public void startTest() {
        Browser browser = PlaywrightManager.getBrowser();
        context = browser.newContext(contextOptions());
        page = context.newPage();
        page.navigate(baseUrl());
    }

    /**
     * Closes the {@link Page} and {@link BrowserContext} created for the test.
     */
    @AfterEach
    public void closeTest() {
        if (page != null) {
            page.close();
        }
        if (context != null) {
            context.close();
        }
    }

    /**
     * Disposes Playwright and Browser instances bound to the current thread
     * via {@link PlaywrightManager}, after all tests in the suite have finished.
     *
     * <p>
     * This is typically invoked once per test class (or test suite),
     * depending on the JUnit configuration and parallel execution mode.
     * </p>
     */
    @AfterAll
    public static void tearDownSuite() {
        PlaywrightManager.killCurrentThread();
    }
}
