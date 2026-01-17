package base;

import com.microsoft.playwright.Browser;

import config.PlaywrightTestBaseConfig;

public class MobileBase extends PlaywrightTestBaseConfig{

	@Override
	protected Browser.NewContextOptions contextOptions() {
	    return new Browser.NewContextOptions()
	            .setViewportSize(414, 896)
	            .setIsMobile(true)
	            .setHasTouch(true)
	            .setDeviceScaleFactor(2)
	            .setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 14_0 like Mac OS X)")
	            .setLocale("pt-BR");
	}
}
