package SRM.releases2026.jan.demoqa_regression.elements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.pages.DemoQaMenuPage;
import apps.demoQA.pages.elements.ButtonsPage;
import io.qameta.allure.*;

@Epic("Regression - 2026")
@Feature("Element flows")
public class ButtonsTest extends DemoQATestBase {
	
	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	ButtonsPage buttonsPage = new ButtonsPage();
	
	/**
	 * Given a user access Buttons Page
	 * <br>
	 * When user give a Double Click on 'Double Click Me' button
	 * <br>
	 * Then system present a text message 'You have done a double click'
	 */
	@Story("Buttons flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user gives a double click on 'Double Click Me' button then a text should present on screen")
	@Description(useJavaDoc = true)
	@Test
	public void doubleClickOnDoubleClickMeButton() {
		menuPage.accessButtonsPage(page);
		buttonsPage.doubleClickOnButton(page);
		Allure.step("Verify if text is correctly present on screen", () -> {			
			assertTrue(buttonsPage.getDoubleClickMessage(page).contains("You have done a double click"), "Expected value to be 'You have done a double click'");
		});
	}
	
	/**
	 * Given a user access Buttons Page
	 * <br>
	 * When user give a Right Click on 'Right Click Me' button
	 * <br>
	 * Then system present a text message 'You have done a right click'
	 */
	@Story("Buttons flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user gives a right click on 'Right Click Me' button then a text should present on screen")
	@Description(useJavaDoc = true)
	@Test
	public void rightClickOnRightClickMeButton() {
		menuPage.accessButtonsPage(page);
		buttonsPage.rightClickOnButton(page);
		Allure.step("Verify if text is correctly present on screen", () -> {
			assertTrue(buttonsPage.getRightClickMessage(page).contains("You have done a right click"), "Expected value to be 'You have done a right click'");
		});
	}
	
	/**
	 * Given a user access Buttons Page
	 * <br>
	 * When user give a Click on 'Click Me' button
	 * <br>
	 * Then system present a text message 'You have done a dynamic click'
	 */
	@Story("Buttons flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user gives a dynamic click on 'Click Me' button then a text should present on screen")
	@Description(useJavaDoc = true)
	@Test
	public void dynamicClickOnClickMeButton() {
		menuPage.accessButtonsPage(page);
		buttonsPage.dynamicClickOnButton(page);
		Allure.step("Verify if text is correctly present on screen", () -> {
			assertTrue(buttonsPage.getDynamicClickMessage(page).contains("You have done a dynamic click"), "Expected value to be 'You have done a dynamic click'");
		});
	}
}
