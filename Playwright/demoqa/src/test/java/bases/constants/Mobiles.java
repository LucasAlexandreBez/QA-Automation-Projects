package bases.constants;

import com.microsoft.playwright.Browser;

/**
 * Auto-generated from Playwright deviceDescriptorsSource.json.
 * Provides factory methods for mobile/tablet device profiles.
 */
public final class Mobiles {
	
    private Mobiles() {}

    /** Playwright preset for: Blackberry PlayBook */
    public static Browser.NewContextOptions Blackberry_PlayBook() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (PlayBook; U; RIM Tablet OS 2.1.0; en-US) AppleWebKit/536.2+ (KHTML like Gecko) Version/26.0 Safari/536.2+");
        o.setViewportSize(600, 1024);
        o.setDeviceScaleFactor(1);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Blackberry PlayBook landscape */
    public static Browser.NewContextOptions Blackberry_PlayBook_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (PlayBook; U; RIM Tablet OS 2.1.0; en-US) AppleWebKit/536.2+ (KHTML like Gecko) Version/26.0 Safari/536.2+");
        o.setViewportSize(1024, 600);
        o.setDeviceScaleFactor(1);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: BlackBerry Z30 */
    public static Browser.NewContextOptions BlackBerry_Z30() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (BB10; Touch) AppleWebKit/537.10+ (KHTML, like Gecko) Version/26.0 Mobile Safari/537.10+");
        o.setViewportSize(360, 640);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: BlackBerry Z30 landscape */
    public static Browser.NewContextOptions BlackBerry_Z30_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (BB10; Touch) AppleWebKit/537.10+ (KHTML, like Gecko) Version/26.0 Mobile Safari/537.10+");
        o.setViewportSize(640, 360);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy Note 3 */
    public static Browser.NewContextOptions Galaxy_Note_3() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.3; en-us; SM-N900T Build/JSS15J) AppleWebKit/534.30 (KHTML, like Gecko) Version/26.0 Mobile Safari/534.30");
        o.setViewportSize(360, 640);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy Note 3 landscape */
    public static Browser.NewContextOptions Galaxy_Note_3_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.3; en-us; SM-N900T Build/JSS15J) AppleWebKit/534.30 (KHTML, like Gecko) Version/26.0 Mobile Safari/534.30");
        o.setViewportSize(640, 360);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy Note II */
    public static Browser.NewContextOptions Galaxy_Note_II() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.1; en-us; GT-N7100 Build/JRO03C) AppleWebKit/534.30 (KHTML, like Gecko) Version/26.0 Mobile Safari/534.30");
        o.setViewportSize(360, 640);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy Note II landscape */
    public static Browser.NewContextOptions Galaxy_Note_II_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.1; en-us; GT-N7100 Build/JRO03C) AppleWebKit/534.30 (KHTML, like Gecko) Version/26.0 Mobile Safari/534.30");
        o.setViewportSize(640, 360);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy S III */
    public static Browser.NewContextOptions Galaxy_S_III() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.0; en-us; GT-I9300 Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/26.0 Mobile Safari/534.30");
        o.setViewportSize(360, 640);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy S III landscape */
    public static Browser.NewContextOptions Galaxy_S_III_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.0; en-us; GT-I9300 Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/26.0 Mobile Safari/534.30");
        o.setViewportSize(640, 360);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy S5 */
    public static Browser.NewContextOptions Galaxy_S5() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(360, 640);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy S5 landscape */
    public static Browser.NewContextOptions Galaxy_S5_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(640, 360);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy S8 */
    public static Browser.NewContextOptions Galaxy_S8() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 7.0; SM-G950U Build/NRD90M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(360, 740);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy S8 landscape */
    public static Browser.NewContextOptions Galaxy_S8_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 7.0; SM-G950U Build/NRD90M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(740, 360);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy S9+ */
    public static Browser.NewContextOptions Galaxy_S9_() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.0.0; SM-G965U Build/R16NW) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(320, 658);
        o.setDeviceScaleFactor(4.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy S9+ landscape */
    public static Browser.NewContextOptions Galaxy_S9_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.0.0; SM-G965U Build/R16NW) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(658, 320);
        o.setDeviceScaleFactor(4.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy S24 */
    public static Browser.NewContextOptions Galaxy_S24() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 14; SM-S921U) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(360, 780);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy S24 landscape */
    public static Browser.NewContextOptions Galaxy_S24_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 14; SM-S921U) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(780, 360);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy A55 */
    public static Browser.NewContextOptions Galaxy_A55() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 14; SM-A556B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(480, 1040);
        o.setDeviceScaleFactor(2.25);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy A55 landscape */
    public static Browser.NewContextOptions Galaxy_A55_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 14; SM-A556B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(1040, 480);
        o.setDeviceScaleFactor(2.25);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy Tab S4 */
    public static Browser.NewContextOptions Galaxy_Tab_S4() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.1.0; SM-T837A) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Safari/537.36");
        o.setViewportSize(712, 1138);
        o.setDeviceScaleFactor(2.25);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy Tab S4 landscape */
    public static Browser.NewContextOptions Galaxy_Tab_S4_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.1.0; SM-T837A) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Safari/537.36");
        o.setViewportSize(1138, 712);
        o.setDeviceScaleFactor(2.25);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy Tab S9 */
    public static Browser.NewContextOptions Galaxy_Tab_S9() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 14; SM-X710) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Safari/537.36");
        o.setViewportSize(640, 1024);
        o.setDeviceScaleFactor(2.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Galaxy Tab S9 landscape */
    public static Browser.NewContextOptions Galaxy_Tab_S9_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 14; SM-X710) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Safari/537.36");
        o.setViewportSize(1024, 640);
        o.setDeviceScaleFactor(2.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad (gen 5) */
    public static Browser.NewContextOptions iPad_gen_5_() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(768, 1024);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad (gen 5) landscape */
    public static Browser.NewContextOptions iPad_gen_5_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(1024, 768);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad (gen 6) */
    public static Browser.NewContextOptions iPad_gen_6_() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(768, 1024);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad (gen 6) landscape */
    public static Browser.NewContextOptions iPad_gen_6_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(1024, 768);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad (gen 7) */
    public static Browser.NewContextOptions iPad_gen_7_() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(810, 1080);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad (gen 7) landscape */
    public static Browser.NewContextOptions iPad_gen_7_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(1080, 810);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad (gen 11) */
    public static Browser.NewContextOptions iPad_gen_11_() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 18_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/19E241 Safari/604.1");
        o.setViewportSize(656, 944);
        o.setDeviceScaleFactor(2.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad (gen 11) landscape */
    public static Browser.NewContextOptions iPad_gen_11_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 18_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/19E241 Safari/604.1");
        o.setViewportSize(944, 656);
        o.setDeviceScaleFactor(2.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad Mini */
    public static Browser.NewContextOptions iPad_Mini() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(768, 1024);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad Mini landscape */
    public static Browser.NewContextOptions iPad_Mini_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(1024, 768);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad Pro 11 */
    public static Browser.NewContextOptions iPad_Pro_11() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(834, 1194);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPad Pro 11 landscape */
    public static Browser.NewContextOptions iPad_Pro_11_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(1194, 834);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 6 */
    public static Browser.NewContextOptions iPhone_6() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(375, 667);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 6 landscape */
    public static Browser.NewContextOptions iPhone_6_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(667, 375);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 6 Plus */
    public static Browser.NewContextOptions iPhone_6_Plus() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(414, 736);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 6 Plus landscape */
    public static Browser.NewContextOptions iPhone_6_Plus_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(736, 414);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 7 */
    public static Browser.NewContextOptions iPhone_7() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(375, 667);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 7 landscape */
    public static Browser.NewContextOptions iPhone_7_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(667, 375);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 7 Plus */
    public static Browser.NewContextOptions iPhone_7_Plus() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(414, 736);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 7 Plus landscape */
    public static Browser.NewContextOptions iPhone_7_Plus_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(736, 414);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 8 */
    public static Browser.NewContextOptions iPhone_8() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(375, 667);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 8 landscape */
    public static Browser.NewContextOptions iPhone_8_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(667, 375);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 8 Plus */
    public static Browser.NewContextOptions iPhone_8_Plus() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(414, 736);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 8 Plus landscape */
    public static Browser.NewContextOptions iPhone_8_Plus_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(736, 414);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone SE */
    public static Browser.NewContextOptions iPhone_SE() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/26.0 Mobile/14E304 Safari/602.1");
        o.setViewportSize(320, 568);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone SE landscape */
    public static Browser.NewContextOptions iPhone_SE_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/26.0 Mobile/14E304 Safari/602.1");
        o.setViewportSize(568, 320);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone SE (3rd gen) */
    public static Browser.NewContextOptions iPhone_SE_3rd_gen_() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 18_5 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/26.0 Mobile/19E241 Safari/602.1");
        o.setViewportSize(375, 667);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone SE (3rd gen) landscape */
    public static Browser.NewContextOptions iPhone_SE_3rd_gen_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 18_5 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/26.0 Mobile/19E241 Safari/602.1");
        o.setViewportSize(667, 375);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone X */
    public static Browser.NewContextOptions iPhone_X() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(375, 812);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone X landscape */
    public static Browser.NewContextOptions iPhone_X_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/26.0 Mobile/15A372 Safari/604.1");
        o.setViewportSize(812, 375);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone XR */
    public static Browser.NewContextOptions iPhone_XR() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 12_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(414, 896);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone XR landscape */
    public static Browser.NewContextOptions iPhone_XR_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 12_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(896, 414);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 11 */
    public static Browser.NewContextOptions iPhone_11() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(414, 715);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 11 landscape */
    public static Browser.NewContextOptions iPhone_11_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(800, 364);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 11 Pro */
    public static Browser.NewContextOptions iPhone_11_Pro() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(375, 635);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 11 Pro landscape */
    public static Browser.NewContextOptions iPhone_11_Pro_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(724, 325);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 11 Pro Max */
    public static Browser.NewContextOptions iPhone_11_Pro_Max() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(414, 715);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 11 Pro Max landscape */
    public static Browser.NewContextOptions iPhone_11_Pro_Max_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(808, 364);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 12 */
    public static Browser.NewContextOptions iPhone_12() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(390, 664);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 12 landscape */
    public static Browser.NewContextOptions iPhone_12_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(750, 340);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 12 Pro */
    public static Browser.NewContextOptions iPhone_12_Pro() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(390, 664);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 12 Pro landscape */
    public static Browser.NewContextOptions iPhone_12_Pro_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(750, 340);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 12 Pro Max */
    public static Browser.NewContextOptions iPhone_12_Pro_Max() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(428, 746);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 12 Pro Max landscape */
    public static Browser.NewContextOptions iPhone_12_Pro_Max_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(832, 378);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 12 Mini */
    public static Browser.NewContextOptions iPhone_12_Mini() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(375, 629);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 12 Mini landscape */
    public static Browser.NewContextOptions iPhone_12_Mini_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(712, 325);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 13 */
    public static Browser.NewContextOptions iPhone_13() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 15_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(390, 664);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 13 landscape */
    public static Browser.NewContextOptions iPhone_13_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 15_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(750, 342);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 13 Pro */
    public static Browser.NewContextOptions iPhone_13_Pro() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 15_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(390, 664);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 13 Pro landscape */
    public static Browser.NewContextOptions iPhone_13_Pro_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 15_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(750, 342);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 13 Pro Max */
    public static Browser.NewContextOptions iPhone_13_Pro_Max() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 15_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(428, 746);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 13 Pro Max landscape */
    public static Browser.NewContextOptions iPhone_13_Pro_Max_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 15_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(832, 380);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 13 Mini */
    public static Browser.NewContextOptions iPhone_13_Mini() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 15_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(375, 629);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 13 Mini landscape */
    public static Browser.NewContextOptions iPhone_13_Mini_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 15_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(712, 327);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 14 */
    public static Browser.NewContextOptions iPhone_14() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(390, 664);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 14 landscape */
    public static Browser.NewContextOptions iPhone_14_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(750, 340);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 14 Plus */
    public static Browser.NewContextOptions iPhone_14_Plus() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(428, 746);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 14 Plus landscape */
    public static Browser.NewContextOptions iPhone_14_Plus_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(832, 378);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 14 Pro */
    public static Browser.NewContextOptions iPhone_14_Pro() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(393, 660);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 14 Pro landscape */
    public static Browser.NewContextOptions iPhone_14_Pro_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(734, 343);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 14 Pro Max */
    public static Browser.NewContextOptions iPhone_14_Pro_Max() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(430, 740);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 14 Pro Max landscape */
    public static Browser.NewContextOptions iPhone_14_Pro_Max_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(814, 380);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 15 */
    public static Browser.NewContextOptions iPhone_15() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(393, 659);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 15 landscape */
    public static Browser.NewContextOptions iPhone_15_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(734, 343);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 15 Plus */
    public static Browser.NewContextOptions iPhone_15_Plus() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(430, 739);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 15 Plus landscape */
    public static Browser.NewContextOptions iPhone_15_Plus_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(814, 380);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 15 Pro */
    public static Browser.NewContextOptions iPhone_15_Pro() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(393, 659);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 15 Pro landscape */
    public static Browser.NewContextOptions iPhone_15_Pro_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(734, 343);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 15 Pro Max */
    public static Browser.NewContextOptions iPhone_15_Pro_Max() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(430, 739);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: iPhone 15 Pro Max landscape */
    public static Browser.NewContextOptions iPhone_15_Pro_Max_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (iPhone; CPU iPhone OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/26.0 Mobile/15E148 Safari/604.1");
        o.setViewportSize(814, 380);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Kindle Fire HDX */
    public static Browser.NewContextOptions Kindle_Fire_HDX() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; U; en-us; KFAPWI Build/JDQ39) AppleWebKit/535.19 (KHTML, like Gecko) Silk/3.13 Safari/535.19 Silk-Accelerated=true");
        o.setViewportSize(800, 1280);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Kindle Fire HDX landscape */
    public static Browser.NewContextOptions Kindle_Fire_HDX_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; U; en-us; KFAPWI Build/JDQ39) AppleWebKit/535.19 (KHTML, like Gecko) Silk/3.13 Safari/535.19 Silk-Accelerated=true");
        o.setViewportSize(1280, 800);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: LG Optimus L70 */
    public static Browser.NewContextOptions LG_Optimus_L70() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; LGMS323 Build/KOT49I.MS32310c) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(384, 640);
        o.setDeviceScaleFactor(1.25);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: LG Optimus L70 landscape */
    public static Browser.NewContextOptions LG_Optimus_L70_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.4.2; en-us; LGMS323 Build/KOT49I.MS32310c) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(640, 384);
        o.setDeviceScaleFactor(1.25);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Microsoft Lumia 550 */
    public static Browser.NewContextOptions Microsoft_Lumia_550() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Windows Phone 10.0; Android 4.2.1; Microsoft; Lumia 550) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36 Edge/14.14263");
        o.setViewportSize(360, 640);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Microsoft Lumia 550 landscape */
    public static Browser.NewContextOptions Microsoft_Lumia_550_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Windows Phone 10.0; Android 4.2.1; Microsoft; Lumia 550) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36 Edge/14.14263");
        o.setViewportSize(640, 360);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Microsoft Lumia 950 */
    public static Browser.NewContextOptions Microsoft_Lumia_950() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Windows Phone 10.0; Android 4.2.1; Microsoft; Lumia 950) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36 Edge/14.14263");
        o.setViewportSize(360, 640);
        o.setDeviceScaleFactor(4);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Microsoft Lumia 950 landscape */
    public static Browser.NewContextOptions Microsoft_Lumia_950_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Windows Phone 10.0; Android 4.2.1; Microsoft; Lumia 950) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36 Edge/14.14263");
        o.setViewportSize(640, 360);
        o.setDeviceScaleFactor(4);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 10 */
    public static Browser.NewContextOptions Nexus_10() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 6.0.1; Nexus 10 Build/MOB31T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Safari/537.36");
        o.setViewportSize(800, 1280);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 10 landscape */
    public static Browser.NewContextOptions Nexus_10_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 6.0.1; Nexus 10 Build/MOB31T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Safari/537.36");
        o.setViewportSize(1280, 800);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 4 */
    public static Browser.NewContextOptions Nexus_4() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 4.4.2; Nexus 4 Build/KOT49H) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(384, 640);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 4 landscape */
    public static Browser.NewContextOptions Nexus_4_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 4.4.2; Nexus 4 Build/KOT49H) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(640, 384);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 5 */
    public static Browser.NewContextOptions Nexus_5() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(360, 640);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 5 landscape */
    public static Browser.NewContextOptions Nexus_5_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(640, 360);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 5X */
    public static Browser.NewContextOptions Nexus_5X() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.0.0; Nexus 5X Build/OPR4.170623.006) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(412, 732);
        o.setDeviceScaleFactor(2.625);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 5X landscape */
    public static Browser.NewContextOptions Nexus_5X_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.0.0; Nexus 5X Build/OPR4.170623.006) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(732, 412);
        o.setDeviceScaleFactor(2.625);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 6 */
    public static Browser.NewContextOptions Nexus_6() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 7.1.1; Nexus 6 Build/N6F26U) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(412, 732);
        o.setDeviceScaleFactor(3.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 6 landscape */
    public static Browser.NewContextOptions Nexus_6_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 7.1.1; Nexus 6 Build/N6F26U) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(732, 412);
        o.setDeviceScaleFactor(3.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 6P */
    public static Browser.NewContextOptions Nexus_6P() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.0.0; Nexus 6P Build/OPP3.170518.006) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(412, 732);
        o.setDeviceScaleFactor(3.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 6P landscape */
    public static Browser.NewContextOptions Nexus_6P_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.0.0; Nexus 6P Build/OPP3.170518.006) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(732, 412);
        o.setDeviceScaleFactor(3.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 7 */
    public static Browser.NewContextOptions Nexus_7() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 6.0.1; Nexus 7 Build/MOB30X) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Safari/537.36");
        o.setViewportSize(600, 960);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nexus 7 landscape */
    public static Browser.NewContextOptions Nexus_7_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 6.0.1; Nexus 7 Build/MOB30X) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Safari/537.36");
        o.setViewportSize(960, 600);
        o.setDeviceScaleFactor(2);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nokia Lumia 520 */
    public static Browser.NewContextOptions Nokia_Lumia_520() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (compatible; MSIE 10.0; Windows Phone 8.0; Trident/6.0; IEMobile/10.0; ARM; Touch; NOKIA; Lumia 520)");
        o.setViewportSize(320, 533);
        o.setDeviceScaleFactor(1.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nokia Lumia 520 landscape */
    public static Browser.NewContextOptions Nokia_Lumia_520_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (compatible; MSIE 10.0; Windows Phone 8.0; Trident/6.0; IEMobile/10.0; ARM; Touch; NOKIA; Lumia 520)");
        o.setViewportSize(533, 320);
        o.setDeviceScaleFactor(1.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nokia N9 */
    public static Browser.NewContextOptions Nokia_N9() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (MeeGo; NokiaN9) AppleWebKit/534.13 (KHTML, like Gecko) NokiaBrowser/8.5.0 Mobile Safari/534.13");
        o.setViewportSize(480, 854);
        o.setDeviceScaleFactor(1);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Nokia N9 landscape */
    public static Browser.NewContextOptions Nokia_N9_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (MeeGo; NokiaN9) AppleWebKit/534.13 (KHTML, like Gecko) NokiaBrowser/8.5.0 Mobile Safari/534.13");
        o.setViewportSize(854, 480);
        o.setDeviceScaleFactor(1);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 2 */
    public static Browser.NewContextOptions Pixel_2() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.0; Pixel 2 Build/OPD3.170816.012) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(411, 731);
        o.setDeviceScaleFactor(2.625);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 2 landscape */
    public static Browser.NewContextOptions Pixel_2_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.0; Pixel 2 Build/OPD3.170816.012) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(731, 411);
        o.setDeviceScaleFactor(2.625);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 2 XL */
    public static Browser.NewContextOptions Pixel_2_XL() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.0.0; Pixel 2 XL Build/OPD1.170816.004) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(411, 823);
        o.setDeviceScaleFactor(3.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 2 XL landscape */
    public static Browser.NewContextOptions Pixel_2_XL_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 8.0.0; Pixel 2 XL Build/OPD1.170816.004) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(823, 411);
        o.setDeviceScaleFactor(3.5);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 3 */
    public static Browser.NewContextOptions Pixel_3() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 9; Pixel 3 Build/PQ1A.181105.017.A1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(393, 786);
        o.setDeviceScaleFactor(2.75);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 3 landscape */
    public static Browser.NewContextOptions Pixel_3_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 9; Pixel 3 Build/PQ1A.181105.017.A1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(786, 393);
        o.setDeviceScaleFactor(2.75);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 4 */
    public static Browser.NewContextOptions Pixel_4() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 10; Pixel 4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(353, 745);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 4 landscape */
    public static Browser.NewContextOptions Pixel_4_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 10; Pixel 4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(745, 353);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 4a (5G) */
    public static Browser.NewContextOptions Pixel_4a_5G_() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 11; Pixel 4a (5G)) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(412, 765);
        o.setDeviceScaleFactor(2.63);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 4a (5G) landscape */
    public static Browser.NewContextOptions Pixel_4a_5G_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 11; Pixel 4a (5G)) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(840, 312);
        o.setDeviceScaleFactor(2.63);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 5 */
    public static Browser.NewContextOptions Pixel_5() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(393, 727);
        o.setDeviceScaleFactor(2.75);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 5 landscape */
    public static Browser.NewContextOptions Pixel_5_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(802, 293);
        o.setDeviceScaleFactor(2.75);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 7 */
    public static Browser.NewContextOptions Pixel_7() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 14; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(412, 839);
        o.setDeviceScaleFactor(2.625);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Pixel 7 landscape */
    public static Browser.NewContextOptions Pixel_7_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 14; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(863, 360);
        o.setDeviceScaleFactor(2.625);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Moto G4 */
    public static Browser.NewContextOptions Moto_G4() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 7.0; Moto G (4)) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(360, 640);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

    /** Playwright preset for: Moto G4 landscape */
    public static Browser.NewContextOptions Moto_G4_landscape() {
        Browser.NewContextOptions o = new Browser.NewContextOptions();
        o.setUserAgent("Mozilla/5.0 (Linux; Android 7.0; Moto G (4)) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.7559.20 Mobile Safari/537.36");
        o.setViewportSize(640, 360);
        o.setDeviceScaleFactor(3);
        o.setIsMobile(true);
        o.setHasTouch(true);
        return o;
    }

}