package base;

import com.microsoft.playwright.Browser;

import config.PlaywrightTestBaseConfig;

public class DesktopBase extends PlaywrightTestBaseConfig{

    @Override
    protected Browser.NewContextOptions contextOptions() {
        return new Browser.NewContextOptions()
            .setViewportSize(1280, 800)
            .setIsMobile(false);
    }
}
