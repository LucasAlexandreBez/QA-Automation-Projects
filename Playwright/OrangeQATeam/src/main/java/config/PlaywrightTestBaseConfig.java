package config;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

@TestInstance(Lifecycle.PER_CLASS)
public class PlaywrightTestBaseConfig {

	protected Playwright playwright;
	protected BrowserType browserType;
	protected Browser browser;
	protected BrowserContext context;
	protected Page page;

	protected BrowserType setBrowserType() {
		return playwright.chromium();
	}

	protected Browser.NewContextOptions contextOptions() {
		return new Browser.NewContextOptions().setLocale("pt-BR");
	}

	protected String baseUrl() {
		return "https://opensource-demo.orangehrmlive.com/";
	}

	@BeforeAll
	public void setupPlaywright() {
		playwright = Playwright.create();
		browserType = setBrowserType();
		browser = browserType.launch();
	}

	@BeforeEach
	public void start() {
		context = browser.newContext(contextOptions());
		page = context.newPage();
		page.navigate(baseUrl());
	}

	@AfterEach
	void close() {
		page.close();
		context.close();
	}

	@AfterAll
	public void closePlaywright() {
		browser.close();
		playwright.close();
	}

}
