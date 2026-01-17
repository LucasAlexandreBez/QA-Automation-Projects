package pages.elements;


import java.util.List;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import pages.DSL;

public class TextBoxPage extends DSL{
	
	private Page page;
	
    /**
     * Creates a new TextBoxPage bound to the given Playwright {@link Page}.
     *
     * @param page browser page instance
     */
	public TextBoxPage(Page page) {
		this.page = page;
	}
	
	public void writeOnUsernameInput(String name) {
		writeOnInput(page.locator("#userName"), name);
	}
	
	public void writeOnEmailInput(String email) {
		writeOnInput(page.locator("#userEmail"), email);
	}
	
	public void writeOnCurrentAddressInput(String currentAddress) {
		writeOnInput(page.locator("#currentAddress"), currentAddress);
	}
	
	public void writeOnPermantAddressInput(String permantAddress) {
		writeOnInput(page.locator("#permanentAddress"), permantAddress);
	}
	
	public void writeOnAllTheFormInput(String name, String email, String currentAddress, String permantAddress) {
		writeOnUsernameInput(name);
		writeOnEmailInput(email);
		writeOnCurrentAddressInput(currentAddress);
		writeOnPermantAddressInput(permantAddress);
		clickOnElement(page.locator("#submit"));
	}
	
	public List<String> getOutputValues() {
	    Locator container = page.locator("#output");
	    Locator ps = container.locator("p");
	    return ps.allInnerTexts();
	}
}
