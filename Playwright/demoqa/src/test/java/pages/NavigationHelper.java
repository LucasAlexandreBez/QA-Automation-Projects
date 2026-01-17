package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class NavigationHelper extends DSL{
	
    private final Page page;

    public NavigationHelper(Page page) {
        this.page = page;
    }

    public void accessElements() {
    	clickOnElement(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Elements")));    	
    }
    
	public void accessForms() {
		clickOnElement(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Forms")));
	}
	
	public void accessAlertsFramesAndWindows() {
		clickOnElement(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Alerts, Frame & Windows")));
	}
	
	public void accessWidgets() {
		clickOnElement(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Widgets")));
	}
	
	public void accessInteractions() {
		clickOnElement(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Interactions")));
	}
	
	public void accessBookStoreApplication() {
		clickOnElement(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Book Store Application")));
	}
	
	// =================================== ELEMENTS SUB ===================================
	public void accessTextBox() {
		accessElements();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Text Box")));
	}
	
	public void accessCheckBox() {
		accessElements();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Check Box")));
	}
	
	public void accessRadioButton() {
		accessElements();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Radio Button")));
	}
	
	public void accessWebTables() {
		accessElements();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Web Tables")));
	}
	
	public void accessButtons() {
		accessElements();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Buttons")));
	}
	
	public void acessLinks() {
		accessElements();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Links")));
	}
	
	public void accessBrokenLInksImages() {
		accessElements();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Broken Links - Images")));
	}
	
	public void accessUploadAndDownload() {
		accessElements();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Upload and Download")));
	}
	
	public void accessDynamicProperties() {
		accessElements();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Dynamic Properties")));
	}
	
	// =================================== FORMS SUB ===================================
	public void accessPracticeForm() {
		accessForms();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Dynamic Properties")));
	}
	
	// =================================== ALERTS, FRAME & WINDOW SUB ===================================
	public void accessBrowserWindows() {
		accessAlertsFramesAndWindows();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Browser Windows")));
	}
	
	public void accessAlerts() {
		accessAlertsFramesAndWindows();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Alerts")));
	}
	
	public void accessFrames() {
		accessAlertsFramesAndWindows();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Frames")));
	}
	
	public void accessNestedFrames() {
		accessAlertsFramesAndWindows();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Nested Frames")));
	}
	
	public void accessModalDialog() {
		accessAlertsFramesAndWindows();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Modal Dialogs")));
	}
	
	// =================================== WIDGETS SUB ===================================
	public void accessAccordian() {
		accessWidgets();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Accordian")));
	}
	
	public void accessAutoComplete() {
		accessWidgets();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Auto Complete")));
	}
	
	public void accessDatePicker() {
		accessWidgets();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Date Picker")));
	}
	
	public void accessSlider() {
		accessWidgets();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Slider")));
	}
	
	public void accessProgressBar() {
		accessWidgets();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Progress Bar")));
	}
	
	public void accessTabs() {
		accessWidgets();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Tabs")));
	}
	
	public void accessToolTips() {
		accessWidgets();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Tool Tips")));
	}
	
	public void accessMenu() {
		accessWidgets();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Menu")));
	}
	
	public void accessSelectedMenu() {
		accessWidgets();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Selected Menu")));
	}
	
	// =================================== INTERACTIONS SUB ===================================
	public void accessSortable() {
		accessInteractions();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Sortable")));
	}
	
	public void accessSelectable() {
		accessInteractions();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Selectable")));
	}
	
	public void accessResizable() {
		accessInteractions();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Resizable")));
	}
	
	public void accessDroppable() {
		accessInteractions();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Droppable")));
	}
	
	public void accessDragabble() {
		accessInteractions();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Dragabble")));
	}
	
	// =================================== BOOK STORE APP SUB ===================================
	public void accessLogin() {
		accessBookStoreApplication();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Login")));
	}
	
	public void accessBookStore() {
		accessBookStoreApplication();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Book Store")));
	}
	
	public void accessProfile() {
		accessBookStoreApplication();
		clickOnElement(page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Profile")));
	}
	
	
}
