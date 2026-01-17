package bases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;

import bases.constants.Desktops;

/**
 * Desktop-oriented Playwright test base.
 *
 * <p>
 * This class specializes {@link TestBaseConfig} for
 * desktop (non–mobile) execution. It configures a standard
 * desktop {@link Browser.NewContextOptions} instance and inherits
 * all lifecycle behavior for Playwright, Browser, Context and Page.
 * </p>
 *
 * <p>
 * Use this base class for UI automated tests that should simulate
 * a desktop browser experience rather than a mobile device.
 * </p>
 *
 * <p>
 * Tests extending this class will automatically:
 * </p>
 * <ul>
 *   <li>reuse the shared Browser instance</li>
 *   <li>create a fresh BrowserContext per test</li>
 *   <li>create a fresh Page per test</li>
 *   <li>navigate to the configured base URL</li>
 * </ul>
 *
 * @author Lucas Alexandre Bez Piancoski
 * @since 1.0.0
 */
public class DesktopBase extends TestBaseConfig {

    /**
     * Provides context options configured for desktop device emulation.
     *
     * @return {@link Browser.NewContextOptions} configured for desktop mode
     */
	@Override
	protected NewContextOptions contextOptions() {
        return Desktops.Desktop_4K_3840x2160().setLocale("pt-BR");
	}
}
