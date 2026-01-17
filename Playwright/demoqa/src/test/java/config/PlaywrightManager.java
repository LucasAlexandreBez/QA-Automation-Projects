package config;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;

/**
 * Provides thread-local management of {@link Playwright} and {@link Browser} instances.
 *
 * <p>
 * Each test thread receives its own isolated Playwright and Browser instance,
 * ensuring thread-safety when running tests in parallel.
 * </p>
 *
 * <p>
 * Instances are lazily created on first access and stored in {@link ThreadLocal} storage.
 * They can be explicitly disposed using {@link #killCurrentThread()}, which closes
 * both the Browser and the underlying Playwright instance for the calling thread.
 * </p>
 *
 * <p>
 * This class is designed as a utility and cannot be instantiated.
 * </p>
 *
 * @author Lucas Alexandre Bez Piancoski
 * @since 1.0.0
 */
public final class PlaywrightManager {

    /** Thread-local Playwright instance for the current thread. */
    private static final ThreadLocal<Playwright> PLAYWRIGHT_THREAD =
            ThreadLocal.withInitial(Playwright::create);

    /**
     * Thread-local Browser instance created based on the thread-local Playwright.
     * The browser configuration is delegated to {@link Properties#setBrowser(Playwright)}.
     */
    private static final ThreadLocal<Browser> BROWSER_THREAD =
            ThreadLocal.withInitial(() -> Properties.setBrowser(PLAYWRIGHT_THREAD.get()));

    /** Prevents instantiation. */
    private PlaywrightManager() {}

    /**
     * Returns the {@link Browser} associated with the current thread.
     *
     * <p>
     * If the browser has not been created yet for this thread, it will be
     * automatically initialized.
     * </p>
     *
     * @return the thread-local Browser instance
     */
    public static Browser getBrowser() {
        return BROWSER_THREAD.get();
    }

    /**
     * Returns the {@link Playwright} instance associated with the current thread.
     *
     * @return the thread-local Playwright instance
     */
    public static Playwright getPlaywright() {
        return PLAYWRIGHT_THREAD.get();
    }

    /**
     * Disposes Playwright resources for the calling thread.
     *
     * <p>
     * This method closes and removes:
     * </p>
     *
     * <ul>
     *   <li>the {@link Browser} bound to the current thread</li>
     *   <li>the {@link Playwright} instance bound to the current thread</li>
     * </ul>
     *
     * <p>
     * You should call this method when you manage thread lifecycle manually
     * (e.g., custom thread pools) or inside a global test-suite shutdown routine.
     * Frameworks like JUnit may handle thread shutdown automatically depending
     * on the parallel execution mode.
     * </p>
     */
    public static void killCurrentThread() {
        Browser browser = BROWSER_THREAD.get();
        if (browser != null) {
            browser.close();
            BROWSER_THREAD.remove();
        }

        Playwright playwright = PLAYWRIGHT_THREAD.get();
        if (playwright != null) {
            playwright.close();
            PLAYWRIGHT_THREAD.remove();
        }
    }
}
