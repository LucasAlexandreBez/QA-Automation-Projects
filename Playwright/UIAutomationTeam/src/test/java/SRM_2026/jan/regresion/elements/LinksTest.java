package SRM_2026.jan.regresion.elements;

import static org.junit.jupiter.api.Assertions.*;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Page;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.pages.DemoQaMenuPage;
import apps.demoQA.pages.elements.LinksPage;

@Epic("Regression - 2026")
@Feature("Element flows")
public class LinksTest extends DemoQATestBase{
	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	LinksPage linksPage = new LinksPage();
	
	/**
	 * Given a user access Links Page
	 * <br>
	 * When user click on Home link
	 * <br>
	 * Then system open a new tab redirecting to the home page
	 */
	@Story("Links flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user click on Home link then a new tab should open to home page")
	@Description(useJavaDoc = true)
	@Test
	public void clickOnHomeLinkSuccessfully() {
		menuPage.accessLinksPage(page);
		Page newTab = linksPage.clickOnHomeLinkAndGetNewTab(page);
		newTab.bringToFront();
		Allure.step("Verify if url is correct", () -> {
			assertTrue(newTab.url().contains("https://demoqa.com"));
		});
		newTab.close();
	}
	
	/**
	 * Given a user access Links Page
	 * <br>
	 * When user click on Dynamic Home link
	 * <br>
	 * Then system open a new tab redirecting to the home page
	 */
	@Story("Links flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user click on Dynamic Home link then a new tab should open to home page")
	@Description(useJavaDoc = true)
	@Test
	public void clickOnDynamicLinkSuccessfully() {
		menuPage.accessLinksPage(page);
		Page newTab = linksPage.clickOnDynamicHomeLinkAndGetNewTab(page);
		newTab.bringToFront();
		Allure.step("Verify if url is correct", () -> {
			assertTrue(newTab.url().contains("https://demoqa.com"));
		});
		newTab.close();
	}
	
	/**
	 * Given a user access Links Page
	 * <br>
	 * When user click on Created link
	 * <br>
	 * Then system present on screen the text "Link has responded with staus 201 and status text Created"
	 */
	@Story("Links flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user click on Created link then system should present a text value on screen")
	@Description(useJavaDoc = true)
	@Test
	public void clickOnCreatedLinkSuccessfully() {
		menuPage.accessLinksPage(page);
		linksPage.clickOnCreatedLink(page);
		Allure.step("Verify if text is correctly present on screen", () -> {			
		});
		assertTrue(linksPage.getResponseMessage(page).contains("Link has responded with staus 201 and status text Created"));
	}
	
	/**
	 * Given a user access Links Page
	 * <br>
	 * When user click on No Content link
	 * <br>
	 * Then system present on screen the text "Link has responded with staus 204 and status text No Content"
	 */
	@Story("Links flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user click on No Content link then system should present a text value on screen")
	@Description(useJavaDoc = true)
	@Test
	public void clickOnNoContentLinkSuccessfully() {
		menuPage.accessLinksPage(page);
		linksPage.clickOnNoContentLink(page);
		Allure.step("Verify if text is correctly present on screen", () -> {			
			assertTrue(linksPage.getResponseMessage(page).contains("Link has responded with staus 204 and status text No Content"));
		});
	}
	
	/**
	 * Given a user access Links Page
	 * <br>
	 * When user click on Moved link
	 * <br>
	 * Then system present on screen the text "Link has responded with staus 301 and status text Moved Permanently"
	 */
	@Story("Links flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user click on Moved link then system should present a text value on screen")
	@Description(useJavaDoc = true)
	@Test
	public void clickOnMovedLinkSuccessfully() {
		menuPage.accessLinksPage(page);
		linksPage.clickOnMovedLink(page);
		Allure.step("Verify if text is correctly present on screen", () -> {			
			assertTrue(linksPage.getResponseMessage(page).contains("Link has responded with staus 301 and status text Moved Permanently"));
		});
	}
	
	/**
	 * Given a user access Links Page
	 * <br>
	 * When user click on Bad Request link
	 * <br>
	 * Then system present on screen the text "Link has responded with staus 400 and status text Bad Request"
	 */
	@Story("Links flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user click on Bad Request link then system should present a text value on screen")
	@Description(useJavaDoc = true)
	@Test
	public void clickOnBadRequestLinkSuccessfully() {
		menuPage.accessLinksPage(page);
		linksPage.clickOnBadRequestLink(page);
		Allure.step("Verify if text is correctly present on screen", () -> {			
			assertTrue(linksPage.getResponseMessage(page).contains("Link has responded with staus 400 and status text Bad Request"));
		});
	}
	
	/**
	 * Given a user access Links Page
	 * <br>
	 * When user click on Unauthorized link
	 * <br>
	 * Then system present on screen the text "Link has responded with staus 401 and status text Unauthorized"
	 */
	@Story("Links flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user click on Unauthorized link then system should present a text value on screen")
	@Description(useJavaDoc = true)
	@Test
	public void clickOnUnauthorizedLinkSuccessfully() {
		menuPage.accessLinksPage(page);
		linksPage.clickOnUnauthorizedLink(page);
		Allure.step("Verify if text is correctly present on screen", () -> {			
			assertTrue(linksPage.getResponseMessage(page).contains("Link has responded with staus 401 and status text Unauthorized"));
		});
	}
	
	/**
	 * Given a user access Links Page
	 * <br>
	 * When user click on Not Found link
	 * <br>
	 * Then system present on screen the text "Link has responded with staus 404 and status text Not Found"
	 */
	@Story("Links flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user click on Not Found link then system should present a text value on screen")
	@Description(useJavaDoc = true)
	@Test
	public void clickOnNotFoundLinkSuccessfully() {
		menuPage.accessLinksPage(page);
		linksPage.clickOnNotFoundLink(page);
		Allure.step("Verify if text is correctly present on screen", () -> {			
			assertTrue(linksPage.getResponseMessage(page).contains("Link has responded with staus 404 and status text Not Found"));
		});
	}
}
