package SRM_2026.jan.regresion.elements;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.enums.CheckboxTreeItems;
import apps.demoQA.page.CheckBoxPage;
import apps.demoQA.page.DemoQaMenuPage;
import io.qameta.allure.*;

@Epic("Regression - 01/2025")
@Feature("Element flows")
public class CheckBoxTest extends DemoQATestBase {

	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	CheckBoxPage checkBoxPage = new CheckBoxPage();

	/**
	 * Given a user access the Checkbox page
	 * When user Check the Home Folder option 
	 * Then result area should present all folders and files text values
	 */
	@Story("Check Box flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Select the Home Folder Checkbox successfully")
	@Description
	@Test
	public void selectHomeFolderWithSuccess() {
		menuPage.accessCheckBoxPage(page);
		checkBoxPage.expandAllFolders(page);
		checkBoxPage.checkByLabel(page, CheckboxTreeItems.HOME);
		List<String> results = checkBoxPage.getSelectedFoldersAndFiles(page);
		Allure.step("Validate if selected folders names will be presented on result area", () -> {
			assertAll("results", 
					() -> assertTrue(results.contains(CheckboxTreeItems.HOME.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.DESKTOP.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.NOTES.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.COMMANDS.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.DOCUMENTS.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.WORKSPACE.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.REACT.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.ANGULAR.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.VEU.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.OFFICE.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.PUBLIC.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.PRIVATE.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.CLASSIFIED.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.GENERAL.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.DOWNLOADS.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.WORD.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.EXCEL.getLabel().toLowerCase()))
			);
		});
	}
	
	/**
	 * Given a user access the Checkbox page
	 * When user Check the Desktop Folder option 
	 * Then result area should present only Desktop, Notes and Commands text values
	 */
	@Story("Check Box flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Select the Desktop Folder Checkbox successfully")
	@Description
	@Test
	public void selectDesktopFolderWithSuccess() {
		menuPage.accessCheckBoxPage(page);
		checkBoxPage.expandAllFolders(page);
		checkBoxPage.checkByLabel(page, CheckboxTreeItems.HOME);
		List<String> results = checkBoxPage.getSelectedFoldersAndFiles(page);
		Allure.step("Validate if selected folders names will be presented on result area", () -> {
			assertAll("results", 
					() -> assertTrue(results.contains(CheckboxTreeItems.DESKTOP.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.NOTES.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.COMMANDS.getLabel().toLowerCase())),
					
					() -> assertFalse(results.contains(CheckboxTreeItems.HOME.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.DOCUMENTS.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.WORKSPACE.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.REACT.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.ANGULAR.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.VEU.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.OFFICE.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.PUBLIC.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.PRIVATE.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.CLASSIFIED.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.GENERAL.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.DOWNLOADS.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.WORD.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.EXCEL.getLabel().toLowerCase()))
			);
		});
	}
	
	/**
	 * Given a user access the Checkbox page
	 * When user Check the Documents Folder option 
	 * And user uncheck Office Folder option
	 * Then result area should present only Workspace, React, Angular and Veu text values
	 */
	@Story("Check Box flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Select the Desktop Folder Checkbox successfully")
	@Description
	@Test
	public void checkDocumentsAndUncheckOfficeFolderWithSuccess() {
		menuPage.accessCheckBoxPage(page);
		checkBoxPage.expandAllFolders(page);
		checkBoxPage.checkByLabel(page, CheckboxTreeItems.HOME);
		List<String> results = checkBoxPage.getSelectedFoldersAndFiles(page);
		Allure.step("Validate if selected folders names will be presented on result area", () -> {
			assertAll("results", 
					() -> assertTrue(results.contains(CheckboxTreeItems.WORKSPACE.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.REACT.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.ANGULAR.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.VEU.getLabel().toLowerCase())),
					
					() -> assertFalse(results.contains(CheckboxTreeItems.HOME.getLabel().toLowerCase().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.DESKTOP.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.NOTES.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.COMMANDS.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.DOCUMENTS.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.OFFICE.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.PUBLIC.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.PRIVATE.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.CLASSIFIED.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.GENERAL.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.DOWNLOADS.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.WORD.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.EXCEL.getLabel().toLowerCase()))
			);
		});
	}
	
	/**
	 * Given a user access the Checkbox page
	 * When user Check the Word File.doc option 
	 * Then result area should present only Word File.doc text values
	 */
	@Story("Check Box flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Select the Desktop Folder Checkbox successfully")
	@Description
	@Test
	public void checkWordFileDocWithSuccess() {
		menuPage.accessCheckBoxPage(page);
		checkBoxPage.expandAllFolders(page);
		checkBoxPage.checkByLabel(page, CheckboxTreeItems.HOME);
		List<String> results = checkBoxPage.getSelectedFoldersAndFiles(page);
		Allure.step("Validate if selected folders names will be presented on result area", () -> {
			assertAll("results", 
					() -> assertTrue(results.contains(CheckboxTreeItems.WORKSPACE.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.REACT.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.ANGULAR.getLabel().toLowerCase())),
					() -> assertTrue(results.contains(CheckboxTreeItems.VEU.getLabel().toLowerCase())),
					
					() -> assertFalse(results.contains(CheckboxTreeItems.HOME.getLabel().toLowerCase().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.DESKTOP.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.NOTES.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.COMMANDS.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.DOCUMENTS.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.OFFICE.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.PUBLIC.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.PRIVATE.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.CLASSIFIED.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.GENERAL.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.DOWNLOADS.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.WORD.getLabel().toLowerCase())),
					() -> assertFalse(results.contains(CheckboxTreeItems.EXCEL.getLabel().toLowerCase()))
			);
		});
	}
}
