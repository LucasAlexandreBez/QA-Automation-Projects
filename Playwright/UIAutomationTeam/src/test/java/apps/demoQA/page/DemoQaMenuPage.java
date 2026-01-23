package apps.demoQA.page;

import java.util.regex.Pattern;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import io.qameta.allure.Step;

public class DemoQaMenuPage {
	
	// =================================== ELEMENTS ===================================
	@Step("Access Elements menu")
	public void accessElementsMenu(Page page) {
        page.getByRole(
	            AriaRole.HEADING,
	            new Page.GetByRoleOptions().setName("Elements")
	        ).click();
		Locator locator = page.locator(".element-list").first();
	    if (!locator.getAttribute("class").contains("show")) {
	    	page.locator(".header-wrapper").first().click();
	    }
	}

	@Step("Access Text Box page")
	public void accessTextBoxPage(Page page) {
		accessElementsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Text Box")).click();
	}

	@Step("Access Check Box page")
	public void accessCheckBoxPage(Page page) {
		accessElementsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Check Box")).click();
	}

	@Step("Access Radio Button page")
	public void accessRadioButtonPage(Page page) {
		accessElementsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Radio Button")).click();
	}

	@Step("Access Web Tables page")
	public void accessWebTablesPage(Page page) {
		accessElementsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Web Tables")).click();
	}

	@Step("Access Buttons page")
	public void accessButtonsPage(Page page) {
		accessElementsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Buttons")).click();
	}

	@Step("Access Links page")
	public void acessLinksPage(Page page) {
		accessElementsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Links")).click();
	}

	@Step("Access Broken Links Images page")
	public void accessBrokenLinksImagesPage(Page page) {
		accessElementsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Broken Links - Images"))
				.click();
	}

	@Step("Access Upload AndDownload page")
	public void accessUploadAndDownloadPage(Page page) {
		accessElementsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Upload and Download")).click();
	}

	@Step("Access Dynamic Properties page")
	public void accessDynamicPropertiesPage(Page page) {
		accessElementsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Dynamic Properties")).click();
	}

	// =================================== FORMS ===================================
	@Step("Access Forms menu")
	public void accessFormsMenu(Page page) {
		page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Forms")).click();
		Locator locator = page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Practice Form$")));
	    if (!locator.getAttribute("class").contains("show")) {
	    	page.locator("div:nth-child(2) > .group-header > .header-wrapper").click();
	    }
	}

	@Step("Access Practice Form page")
	public void accessPracticeFormPage(Page page) {
		accessFormsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Dynamic Properties")).click();
	}

	// =================================== ALERTS, FRAME & WINDOW ===================================
	@Step("Access Frames And Windows menu")
	public void accessAlertsFramesAndWindowsMenu(Page page) {
		page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Alerts, Frame & Windows")).click();
		Locator locator = page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Browser WindowsAlertsFramesNested FramesModal Dialogs$")));
	    if (!locator.getAttribute("class").contains("show")) {
	    	page.getByText("Alerts, Frame & Windows").click();
	    }
	}
	
	@Step("Access Browser Windows page")
	public void accessBrowserWindowsPage(Page page) {
		accessAlertsFramesAndWindowsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Browser Windows")).click();
	}

	@Step("Access Alerts page")
	public void accessAlertsPage(Page page) {
		accessAlertsFramesAndWindowsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Alerts")).click();
	}

	@Step("Access Frames page")
	public void accessFramesPage(Page page) {
		accessAlertsFramesAndWindowsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Frames")).click();
	}

	@Step("Access Nested Frames page")
	public void accessNestedFramesPage(Page page) {
		accessAlertsFramesAndWindowsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Nested Frames")).click();
	}

	@Step("Access Modal Dialog page")
	public void accessModalDialogPage(Page page) {
		accessAlertsFramesAndWindowsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Modal Dialogs")).click();
	}

	// =================================== WIDGETS ===================================
	@Step("Access Widgets menu")
	public void accessWidgetsMenu(Page page) {
		page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Widgets")).click();
		Locator locator = page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^AccordianAuto CompleteDate PickerSliderProgress BarTabsTool TipsMenuSelect Menu$")));
	    if (!locator.getAttribute("class").contains("show")) {
	    	page.locator("div:nth-child(4) > .group-header > .header-wrapper").click();
	    }
	}
	
	@Step("Access Accordian page")
	public void accessAccordianPage(Page page) {
		accessWidgetsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Accordian")).click();
	}

	@Step("Access Auto Complete page")
	public void accessAutoCompletePage(Page page) {
		accessWidgetsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Auto Complete")).click();
	}

	@Step("Access Date Picker page")
	public void accessDatePickerPage(Page page) {
		accessWidgetsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Date Picker")).click();
	}

	@Step("Access Slider page")
	public void accessSliderPage(Page page) {
		accessWidgetsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Slider")).click();
	}

	@Step("Access Progress Bar page")
	public void accessProgressBarPage(Page page) {
		accessWidgetsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Progress Bar")).click();
	}

	@Step("Access Tabs page")
	public void accessTabsPage(Page page) {
		accessWidgetsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Tabs")).click();
	}

	@Step("Access Tool Tips page")
	public void accessToolTipsPage(Page page) {
		accessWidgetsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Tool Tips")).click();
	}

	@Step("Access Menu page")
	public void accessMenuPage(Page page) {
		accessWidgetsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Menu")).click();
	}

	@Step("Access Selected page")
	public void accessSelectedPage(Page page) {
		accessWidgetsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Selected Menu")).click();
	}

	// =================================== INTERACTIONS ===================================
	@Step("Access Interactions menu")
	public void accessInteractionsMenu(Page page) {
		page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Interactions")).click();
		Locator locator = page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^SortableSelectableResizableDroppableDragabble$")));
	    if (!locator.getAttribute("class").contains("show")) {
	    	page.locator("div:nth-child(5) > .group-header > .header-wrapper").click();
	    }
	}
	
	@Step("Access Accordian page")
	public void accessSortablePage(Page page) {
		accessInteractionsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Sortable")).click();
	}

	@Step("Access Selectable page")
	public void accessSelectablePage(Page page) {
		accessInteractionsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Selectable")).click();
	}

	@Step("Access Resizable page")
	public void accessResizablePage(Page page) {
		accessInteractionsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Resizable")).click();
	}

	@Step("Access Droppable page")
	public void accessDroppablePage(Page page) {
		accessInteractionsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Droppable")).click();
	}

	@Step("Access Dragabble page")
	public void accessDragabblePage(Page page) {
		accessInteractionsMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Dragabble")).click();
	}

	// =================================== BOOK STORE ===================================
	@Step("Access Book Store menu")
	public void accessBookStoreApplicationMenu(Page page) {
		page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Book Store Application")).click();
		Locator locator = page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^LoginBook StoreProfileBook Store API$")));
	    if (!locator.getAttribute("class").contains("show")) {
	    	page.getByText("Book Store Application").click();
	    }
	}
	
	@Step("Access Login page")
	public void accessLoginPage(Page page) {
		accessBookStoreApplicationMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Login")).click();
	}

	@Step("Access Book Store page")
	public void accessBookStorePage(Page page) {
		accessBookStoreApplicationMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Book Store")).click();
	}

	@Step("Access Profile page")
	public void accessProfilePage(Page page) {
		accessBookStoreApplicationMenu(page);
		page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Profile")).click();
	}

}
