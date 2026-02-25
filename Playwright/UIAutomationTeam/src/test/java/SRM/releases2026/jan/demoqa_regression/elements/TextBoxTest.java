package SRM.releases2026.jan.demoqa_regression.elements;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

import io.qameta.allure.*;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.pages.DemoQaMenuPage;
import apps.demoQA.pages.elements.TextBoxPage;

@Epic("Regression - 2026")
@Feature("Element flows")
public class TextBoxTest extends DemoQATestBase {
	
	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	TextBoxPage textBoxPage = new TextBoxPage();

	/**
	 * Given a user access TextBox page
	 * <br>
	 * And user fulfill the input full name with valid name
	 * <br>
	 * And user fulfill the input email with valid email
	 * <br>
	 * And user fulfill the input current address with valid address
	 * <br>
	 * And user fulfill the input permanent address with valid address
	 * <br>
	 * When user click on submit button
	 * <br>
	 * Then system submit form with values provided by the user on the inputs full name, email, current address and permanent address successfully
	 * <br>
	 * And system present below the form the values provided by the user on the inputs full name, email, current address and permanent address 
	 */
	@Story("Text Box flow")
	@DisplayName("Fullfill the text box form and submit with success")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@Owner("Lucas Alexandre")
	@Description(useJavaDoc = true)
	@ParameterizedTest(name = "Submit TextBox form - {index}")
	@CsvSource({
	    "Test 1, Test1@email.com, Test Current Adress 1, Test Permanent Adress 1",
	    "Test 2, Test2@email.com, Test Current Adress 2, Test Permanent Adress 2",
	    "Test 3, Test3@email.com, Test Current Adress 3, Test Permanent Adress 3"
	})
	public void fillTheTextBoxFormAndSubmitWithSuccess(String fullname, String email, String currentAddress, String permanentAddress) {
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
