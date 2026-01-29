package SRM_2026.jan.regresion.elements;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Pattern;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.assertions.LocatorAssertions;
import com.microsoft.playwright.assertions.LocatorAssertions.IsEnabledOptions;
import com.microsoft.playwright.assertions.LocatorAssertions.IsVisibleOptions;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.pages.DemoQaMenuPage;
import apps.demoQA.pages.elements.DynamicPropertiesPage;

@Epic("Regression - 2026")
@Feature("Element flows")
public class DynamicPropertiesTest  extends DemoQATestBase {

	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage();
	
	/**
	 * Given a user access Dynamic Properties Page
	 * <br>
	 * And system present on screen a text with value 'This text has random Id'
	 * <br>
	 * When system give a id for the text paragraph 'This text has random Id'
	 * <br>
	 * And user reload then page
	 * <br>
	 * Then system will present on screen a text with value 'This text has random Id'
	 * <br>
	 * And system give a new id for the text paragraph 'This text has random Id'
	 */
	@Story("Dynamic Properties flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify system will present on screen a text with value 'This text has random Id'")
	@Description(useJavaDoc = true)
	@Test
	public void verifyTheRandomIdText() {
		String firstId;
		String secondId;
		menuPage.accessDynamicPropertiesPage(page);
		firstId = dynamicPropertiesPage.getRandomIdFromParagraph(page);
		page.reload();
		secondId = dynamicPropertiesPage.getRandomIdFromParagraph(page);
		Allure.step("Verify that system changed the id of the pararaph dynamically", () -> {
			assertFalse(firstId.contentEquals(secondId));
		});
	}
	
	/**
	 * Given a user access Dynamic Properties Page
	 * <br>
	 * When is passed 5 seconds
	 * <br>
	 * Then 'Will enabled 5 seconds' button should be enabled
	 */
	@Story("Dynamic Properties flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify when 5 seconds is passed 'Will enabled 5 seconds' button should be enabled")
	@Description(useJavaDoc = true)
	@Test
	public void verifyAfter5SecondsButtonShouldBeEnabled() {
		menuPage.accessDynamicPropertiesPage(page);
		Locator button = dynamicPropertiesPage.getButtonWillEnable5Seconds(page);
		Allure.step("Verify that after 5 seconds 'Will enabled 5 seconds' button will be enabled", () -> {
		    assertThat(button).isDisabled();
		    page.waitForTimeout(7_000);
		    assertThat(button).isEnabled(new IsEnabledOptions().setTimeout(7000));
		});
	}
	
	/**
	 * Given a user access Dynamic Properties Page
	 * <br>
	 * When is passed 5 seconds
	 * <br>
	 * Then 'Visible after 5 seconds' button should be visible
	 */
	@Story("Dynamic Properties flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify when 5 seconds is passed 'Visible after 5 seconds' button should be enabled")
	@Description(useJavaDoc = true)
	@Test
	public void verifyAfter5SecondsButtonShouldBeVisible() {
		menuPage.accessDynamicPropertiesPage(page);
		Locator button = dynamicPropertiesPage.getButtonVisibleAfter5Seconds(page);
		Allure.step("Verify that after 5 seconds 'Visible after 5 seconds' button will be enabled", () -> {		
		    assertThat(button).isHidden();
		    assertThat(button).isVisible(new IsVisibleOptions().setTimeout(7000));
		});
	}
	
	/**
	 * Given a user access Dynamic Properties Page
	 * <br>
	 * When is passed 5 seconds
	 * <br>
	 * Then 'Color change' button should be with red text
	 */
	@Story("Dynamic Properties flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify when 5 seconds is passed 'Color change' button should be with red text")
	@Description(useJavaDoc = true)
	@Test
	public void veriyColorChangeAtColorChangeButton() {
		menuPage.accessDynamicPropertiesPage(page);
		Allure.step("Verify button changed to red text after 5 seconds", () -> {
		    Locator button = dynamicPropertiesPage.getButtonColorChange(page);
		    assertThat(button).not().hasClass(Pattern.compile(".*text-danger.*"));
		    assertThat(button).hasClass(
		        Pattern.compile(".*text-danger.*"),
		        new LocatorAssertions.HasClassOptions().setTimeout(7000)
		    );
		});
	}
}
