package apps.demoQA.page;

import java.util.List;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import apps.demoQA.enums.CheckboxTreeItems;
import io.qameta.allure.Step;

public class CheckBoxPage {

	@Step("Check the checkbox")
	public void checkByLabel(Page page, CheckboxTreeItems item) {
	    page.locator("label")
	    	.filter(new Locator.FilterOptions().setHasText(item.getLabel()))
	        .locator("input[type='checkbox']")
	        .check();
	}
	
	@Step("Uncheck the checkbox")
	public void uncheckByLabel(Page page, CheckboxTreeItems item) {
	    page.locator("label")
	    	.filter(new Locator.FilterOptions().setHasText(item.getLabel()))
	        .locator("input[type='checkbox']")
	        .uncheck();
	}
	
	@Step("Expand all folder list")
	public void expandAllFolders(Page page) {
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Expand all")).click();
	}

	@Step("Collapse all folder list")
	public void collapseAllFolders(Page page) {
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Collapse all")).click();
	}
	
	public List<String> getSelectedFoldersAndFiles(Page page){
		page.locator("#result").scrollIntoViewIfNeeded();
		Locator outpuValueList = page.locator("#result").locator("span");
		return outpuValueList.allInnerTexts();
	}
	
}
