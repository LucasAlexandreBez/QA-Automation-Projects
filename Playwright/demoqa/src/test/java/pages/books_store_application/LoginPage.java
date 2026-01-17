package pages.books_store_application;

import com.microsoft.playwright.Page;

import pages.DSL;

public class LoginPage extends DSL{
	
	private Page page;
	
	public LoginPage(Page page) {
		this.page = page;
	}

	public void fillUsername(String username) {
		writeOnInput(page.getByLabel(""), username);
	}
	
	public void fillPassword(String password) {
		writeOnInput(page.getByLabel(""), password);
	}
	
	public void loginAs(String username, String password) {
		fillUsername(username);
		fillPassword(password);
		clickOnElement(page.getByLabel(""));
	}
}
