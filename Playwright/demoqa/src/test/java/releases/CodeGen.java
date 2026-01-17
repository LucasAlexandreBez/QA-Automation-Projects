package releases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CodeGen {

	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
			BrowserType firefox = playwright.firefox();
			// Make sure to run headed.
			Browser browser = firefox.launch(new BrowserType.LaunchOptions().setHeadless(false));
			// Setup context however you like.
			BrowserContext context = browser.newContext(new NewContextOptions().setViewportSize(1600, 900));
			context.route("**/*", route -> route.resume());
			// Pause the page, and start recording manually.
			Page page = context.newPage();
			page.navigate("https://demoqa.com");
			page.pause();
		}
	}
}
