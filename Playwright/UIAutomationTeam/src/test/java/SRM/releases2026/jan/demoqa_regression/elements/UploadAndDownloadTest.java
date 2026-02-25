package SRM.releases2026.jan.demoqa_regression.elements;

import static org.junit.jupiter.api.Assertions.*;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Download;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.pages.DemoQaMenuPage;
import apps.demoQA.pages.elements.UploadAndDownloadPage;

@Epic("Regression - 2026")
@Feature("Element flows")
public class UploadAndDownloadTest extends DemoQATestBase {

	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	UploadAndDownloadPage uploadAndDownloadPage = new UploadAndDownloadPage();

	/**
	 * Given a user access Uploads and Download Page 
	 * <br>
	 * When user click on Download button 
	 * <br>
	 * Then system download a sample.jpeg file
	 */
	@Story("Upload And Download flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user click on Download button then system download a sample.jpeg file")
	@Description(useJavaDoc = true)
	@Test
	public void clickOnDonwloadButtonSuccessfully() {
		menuPage.accessUploadAndDownloadPage(page);
		Download download = page.waitForDownload(() -> {
			uploadAndDownloadPage.clickOnDownloadButton(page);
		});
		Allure.step("Verify the download file name", () -> {
			assertEquals("sampleFile.jpeg", download.suggestedFilename());
		});
	}

	/**
	 * Given a user access Uploads and Download Page 
	 * <br>
	 * When user click on select file button 
	 * <br>
	 * And system present a pop up to select files from user desktop 
	 * <br>
	 * And user select a file with success 
	 * <br>
	 * And user click on Open at Pop Up 
	 * <br>
	 * Then system upload the selected file from user to server
	 */
	@Story("Upload And Download flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user click on Select file button then system allow user to upload a file from the user desktop")
	@Description(useJavaDoc = true)
	@Test
	public void clickOnSelectFileButtonSuccessfully() {
		menuPage.accessUploadAndDownloadPage(page);
		uploadAndDownloadPage.uploadFileToSystem(page, "C:/Users/Lucas/Desktop/Repositorys/QA-Automation-Projects/Playwright/UIAutomationTeam/src/test/resources/UploadFiles/UploadTest.txt");
		assertTrue(page.locator("#uploadedFilePath").innerText().contains("UploadTest.txt"));
	}
}
