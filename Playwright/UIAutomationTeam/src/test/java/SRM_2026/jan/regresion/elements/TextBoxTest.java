package SRM_2026.jan.regresion.elements;

import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.page.DemoQaMenuPage;
import apps.demoQA.page.TextBoxPage;

import io.qameta.allure.*;

import static org.junit.jupiter.api.Assertions.*;

@Epic("Regression - 01/2025")
@Feature("Element flows")
@ParameterizedClass
@CsvSource({ 
	"Test 1, Test1@email.com, Test Current Adress 1, Test Permanent Adress 1",
	"Test 2,Test2@email.com, Test Current Adress 2, Test Permanent Adress 2",
	"Test 3, Test3@email.com, Test Current Adress 3, Test Permanent Adress 3" 
})
public class TextBoxTest extends DemoQATestBase {

	@Parameter(0)
	private String fullname;
	@Parameter(1)
	private String email;
	@Parameter(2)
	private String currentAddress;
	@Parameter(3)
	private String permanentAddress;

	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	TextBoxPage textBoxPage = new TextBoxPage();

	/**
	 * Fill and submit multiple values and fails if any text on the output don't
	 * match
	 */
	@Story("Text Box flow")
	@DisplayName("Fullfill the text box form and submit with success")
	@Description
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@Owner("Lucas Alexandre")
	@Test
	public void fillTheTextBoxFormAndSubmitWithSuccess() {
		Allure.getLifecycle().updateTestCase(testCase -> testCase.setName(
				String.format("Fullfill the text box form and submit with success - %s", fullname)
		));
		menuPage.accessTextBoxPage(page);
		textBoxPage.fillAllInputsInTheFormInput(page, fullname, email, currentAddress, permanentAddress);
		List<String> outputValues = textBoxPage.getOutputValues(page);
		Allure.step("Validate output values", () -> {
			assertAll("data", 
					() -> assertTrue(outputValues.get(0).contains(fullname)),
					() -> assertTrue(outputValues.get(1).contains(email)),
					() -> assertTrue(outputValues.get(2).contains(currentAddress)),
					() -> assertTrue(outputValues.get(3).contains(permanentAddress)));
		});
	}

}
