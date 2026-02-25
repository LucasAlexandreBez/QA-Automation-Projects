package SRM.releases2026.jan.demoqa_regression.elements;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.enums.CheckboxPageTreeItems;
import apps.demoQA.pages.DemoQaMenuPage;
import apps.demoQA.pages.elements.CheckBoxPage;
import io.qameta.allure.*;

@Epic("Regression - 2026")
@Feature("Element flows")
public class CheckBoxTest extends DemoQATestBase {

	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	CheckBoxPage checkBoxPage = new CheckBoxPage();

	/**
	 * Given a user access the Checkbox page <br>
	 * When user Check the Home Folder option <br>
	 * Then result area should present all folders and files text values
	 */
	@Story("Check Box flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify If user check Root Home folder then all Subfolders and fIles will be checked automatically")
	@Description(useJavaDoc = true)
	@Test
	public void checkHomeFolderSuccessfully() {
		menuPage.accessCheckBoxPage(page);
		checkBoxPage.expandAllFolders(page);
		checkBoxPage.checkByLabel(page, CheckboxPageTreeItems.HOME);
		List<String> results = checkBoxPage.getSelectedFoldersAndFiles(page);
		assertAll("results", () -> {
			for (CheckboxPageTreeItems item : CheckboxPageTreeItems.values()) {
				assertTrue(checkBoxPage.isCheckBoxChecked(page, item));
				assertTrue(results.contains(item.getLabel()));
			}
		});
	}

	/**
	 * Given a user access the Checkbox page <br>
	 * When user Check the Desktop Folder option <br>
	 * Then result area should present only Desktop, Notes and Commands text values
	 */
	@Story("Check Box flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify If User Check Desktop Folder Then All Subfolders And FIles Will Be Checked Automatically")
	@Description(useJavaDoc = true)
	@Test
	public void checkDesktopFolderSuccessfully() {
		menuPage.accessCheckBoxPage(page);
		checkBoxPage.expandAllFolders(page);
		checkBoxPage.checkByLabel(page, CheckboxPageTreeItems.DESKTOP);
		List<String> results = checkBoxPage.getSelectedFoldersAndFiles(page);
		assertAll("results", () -> {
			for (CheckboxPageTreeItems item : CheckboxPageTreeItems.values()) {
				if (item.equals(CheckboxPageTreeItems.DESKTOP) || item.equals(CheckboxPageTreeItems.NOTES)
						|| item.equals(CheckboxPageTreeItems.COMMANDS)) {
					assertTrue(checkBoxPage.isCheckBoxChecked(page, item));
					assertTrue(results.contains(item.getLabel()));
				} else {
					assertFalse(checkBoxPage.isCheckBoxChecked(page, item));
					assertFalse(results.contains(item.getLabel()));
				}
			}
		});
	}

	@Story("Check Box flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify If user check Documents folder and uncheck Office folder then only subfolders and files inside Documens will be checked automatically")
	@Description("Given a user access the Checkbox page \r\n"
			+ "When user Check the Documents Folder option \r\n"
			+ "And user uncheck Office Folder option \r\n"
			+ "Then result area should present only Workspace, React, Angular and Veu text values"
	)
	@Test
	public void checkDocumentsAndUncheckOfficeFolderWithSuccess() {
		menuPage.accessCheckBoxPage(page);
		checkBoxPage.expandAllFolders(page);
		checkBoxPage.checkByLabel(page, CheckboxPageTreeItems.DOCUMENTS);
		checkBoxPage.uncheckByLabel(page, CheckboxPageTreeItems.OFFICE);
		List<String> results = checkBoxPage.getSelectedFoldersAndFiles(page);
		assertAll("results", () -> {
			for (CheckboxPageTreeItems item : CheckboxPageTreeItems.values()) {
				if (item.equals(CheckboxPageTreeItems.WORKSPACE) || item.equals(CheckboxPageTreeItems.REACT)
						|| item.equals(CheckboxPageTreeItems.ANGULAR) || item.equals(CheckboxPageTreeItems.VEU)) {
					assertTrue(checkBoxPage.isCheckBoxChecked(page, item));
					assertTrue(results.contains(item.getLabel()));
				} else {
					assertTrue(checkBoxPage.isCheckBoxChecked(page, item));
					assertFalse(results.contains(item.getLabel()));
				}
			}
		});
	}

	/**
	 * Given a user access the Checkbox page <br>
	 * When user Check the Word File.doc option <br>
	 * Then result area should present only Word File.doc text values
	 */
	@Story("Check Box flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify If user Check Word File.doc then only the Word File.doc would be checked")
	@Description(useJavaDoc = true)
	@Test
	public void checkWordFileDocWithSuccess() {
		menuPage.accessCheckBoxPage(page);
		checkBoxPage.expandAllFolders(page);
		checkBoxPage.checkByLabel(page, CheckboxPageTreeItems.WORD);
		List<String> results = checkBoxPage.getSelectedFoldersAndFiles(page);
		assertAll("results", () -> {
			for (CheckboxPageTreeItems item : CheckboxPageTreeItems.values()) {
				if (item.equals(CheckboxPageTreeItems.WORD)) {
					assertTrue(checkBoxPage.isCheckBoxChecked(page, item));
					assertTrue(results.contains(item.getLabel()));
				} else {
					assertFalse(checkBoxPage.isCheckBoxChecked(page, item));
					assertFalse(results.contains(item.getLabel()));
				}
			}
		});
	}
}
