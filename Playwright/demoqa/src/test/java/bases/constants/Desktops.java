package bases.constants;

import com.microsoft.playwright.Browser;

public class Desktops {

    private Desktops() {}

    /** Full HD 1920x1080 Chrome (normal DPI) */
    public static Browser.NewContextOptions Desktop_Chrome_FullHD() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0 Safari/537.36");
        o.setViewportSize(1920, 1080);
        o.setDeviceScaleFactor(1);
        o.setIsMobile(false);
        o.setHasTouch(false);
        return o;
    }

    /** Full HD 1920x1080 Chrome HiDPI */
    public static Browser.NewContextOptions Desktop_Chrome_FullHD_HiDPI() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0 Safari/537.36");
        o.setViewportSize(1920, 1080);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(false);
        o.setHasTouch(false);
        return o;
    }

    /** Notebook 1366x768 */
    public static Browser.NewContextOptions Desktop_Notebook1366x768() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setViewportSize(1366, 768);
        o.setDeviceScaleFactor(1);
        o.setIsMobile(false);
        o.setHasTouch(false);
        return o;
    }

    /** 2K QHD 2560x1440 monitor */
    public static Browser.NewContextOptions Desktop_QHD_2560x1440() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setViewportSize(2560, 1440);
        o.setDeviceScaleFactor(1);
        o.setIsMobile(false);
        o.setHasTouch(false);
        return o;
    }

    /** 4K UHD 3840x2160 monitor */
    public static Browser.NewContextOptions Desktop_4K_3840x2160() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setViewportSize(3840, 2160);
        o.setDeviceScaleFactor(2); // 4K normalmente HiDPI
        o.setIsMobile(false);
        o.setHasTouch(false);
        return o;
    }

    /** macOS Safari Retina */
    public static Browser.NewContextOptions MacOS_Safari_Retina() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 13_0) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Safari/605.1.15");
        o.setViewportSize(1440, 900);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(false);
        o.setHasTouch(false);
        return o;
    }
}
