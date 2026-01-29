package SRM_2026.jan.regresion.elements;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.enums.RadioButtonPageOption;
import apps.demoQA.pages.DemoQaMenuPage;
import apps.demoQA.pages.elements.RadioButtonPage;
import io.qameta.allure.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Regression - 2026")
@Feature("Element flows")
public class RadioButtonTest extends DemoQATestBase {

	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	RadioButtonPage radioButtonPage = new RadioButtonPage();

	/**
	 * Given a user access Radio Button Page
	 * <br>
	 * And select 'Yes' radio Button
	 * <br>
	 * When user select the 'Impressive' Radio Button
	 * <br>
	 * Then 'Yes' radio button will be deselected
	 * <br>
	 * And 'You have selected' area will present only the value 'Impressive'
	 */
	@Story("Radio Button flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify user can select only 1 of the radio buttons option")
	@Description(useJavaDoc = true)
	@Test
	public void selectOneOfTheRadioButtonSuccessfully() {
		menuPage.accessRadioButtonPage(page);
		radioButtonPage.selectRadioButtonOption(page, RadioButtonPageOption.YES);
		Allure.step("Verify that Yes radio button option is the only one select, and the 'You have selected' area present the correct value",
				() -> {
					for (RadioButtonPageOption item : RadioButtonPageOption.values()) {
						if (item.equals(RadioButtonPageOption.YES)) {
							assertTrue(radioButtonPage.getValueOnYouHaveSelectedArea(page).contains(item.getLabel()));
							assertTrue(radioButtonPage.isRadioButtonChecked(page, item));
						} else {
							assertFalse(radioButtonPage.getValueOnYouHaveSelectedArea(page).contains(item.getLabel()));
							assertFalse(radioButtonPage.isRadioButtonChecked(page, item));
						}
					}
				}
		);
		
		radioButtonPage.selectRadioButtonOption(page, RadioButtonPageOption.IMPRESSIVE);
		Allure.step("Verify that Impressive radio button option is the only one select, and the 'You have selected' area present the correct value",
				() -> {
					for (RadioButtonPageOption item : RadioButtonPageOption.values()) {
						if (item.equals(RadioButtonPageOption.IMPRESSIVE)) {
							assertTrue(radioButtonPage.getValueOnYouHaveSelectedArea(page).contains(item.getLabel()));
							assertTrue(radioButtonPage.isRadioButtonChecked(page, item));
						} else {
							assertFalse(radioButtonPage.getValueOnYouHaveSelectedArea(page).contains(item.getLabel()));
							assertFalse(radioButtonPage.isRadioButtonChecked(page, item));
						}
					}
				}
		);
	}

	/**
	 * Given a user access Radio Button Page
	 * <br>
	 * When user try to check 'No' Radio Button
	 * <br>
	 * Then user will not be able as 'No' radio button will be disabled
	 */
	@Story("Radio Button flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify user can't select disabled radio button option")
	@Description(useJavaDoc = true)
	@Test
	public void verifyDisabledRadioButtonCannotBeSelected() {
		menuPage.accessRadioButtonPage(page);
		assertTrue(radioButtonPage.isRadioButtonDisabled(page, RadioButtonPageOption.NO));
	}

}
