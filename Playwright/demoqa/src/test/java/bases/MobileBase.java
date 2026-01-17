package bases;

import com.microsoft.playwright.Browser;

import bases.constants.Mobiles;

/**
 * Mobile-oriented Playwright test base.
 *
 * <p>
 * This class specializes {@link TestBaseConfig} for
 * mobile emulation scenarios. It configures a {@link Browser.NewContextOptions}
 * instance to simulate a typical modern smartphone environment.
 * </p>
 *
 * <p>
 * The configured options emulate:
 * </p>
 * <ul>
 *   <li>mobile viewport size</li>
 *   <li>mobile user agent</li>
 *   <li>touch capability</li>
 *   <li>device pixel density</li>
 *   <li>mobile locale</li>
 * </ul>
 *
 * <p>
 * Use this base class for UI automated tests intended to run
 * against mobile layouts or responsive versions of your application.
 * </p>
 *
 * @author Lucas Alexandre Bez Piancoski
 * @since 1.0.0
 */
public class MobileBase extends TestBaseConfig {

    /**
     * Provides context options configured for mobile device emulation.
     *
     * @return {@link Browser.NewContextOptions} configured for mobile mode
     */
    @Override
    protected Browser.NewContextOptions contextOptions() {
        return Mobiles.Galaxy_Note_3().setLocale("pt-BR");
    }
}
