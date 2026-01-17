package releases.elements;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.provider.CsvSource;

import io.qameta.allure.Allure;
import io.qameta.allure.*;

import bases.DesktopBase;
import pages.NavigationHelper;
import pages.elements.TextBoxPage;

@Epic("Elements")
@Feature("Regression")
@Owner("Lucas Alexandre Bez Piancoski")
@ParameterizedClass(name = "Test multiple text box form fullfillment")
@CsvSource({ 
	"Test 1, test1@email.com, current address 1, permanent address 1", 
	"Test 2, test2@email.com, current address 2, permanent address 2", 
	"Test 3, test3@email.com, current address 3, permanent address 3", 
	"Test 4, test4@email.com, current address 4, permanent address 4", 
})
public class DesktopTest extends DesktopBase{
	
	final String name;
	final String email;
	final String currentAddress;
	final String permanentAddress;

	DesktopTest(String name, String email, String currentAddress, String permanentAddress) {
		this.name = name;
		this.email = email;
		this.currentAddress = currentAddress;
		this.permanentAddress = permanentAddress;
	}

	private NavigationHelper navigationHelper;
	private TextBoxPage textBoxPage;
	
	@BeforeEach
	public void callPages() {
		navigationHelper = new NavigationHelper(page);
		textBoxPage = new TextBoxPage(page);
	}
	
	@Story("Desktop - Text Box")
	@DisplayName("Fullfill the text box form and submit with success")
	@Description("This test attempts to fill and submit multiple values and fails if any text on the output don't match the given value at submition time.")
	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void fillTheTextBoxFormAndSubmitWithSuccess() {
		Allure.step("Access the text box page", () -> {
			navigationHelper.accessTextBox();
		});
	    Allure.step("Fill the text box form", () -> {
	        textBoxPage.writeOnAllTheFormInput(name, email, currentAddress, permanentAddress);
	    });
	    Allure.step("Read the output values", () -> {
	        List<String> outputValues = textBoxPage.getOutputValues();
	        Allure.step("Validate output values", () -> {
	            assertAll("data", 
	                () -> assertTrue(outputValues.contains(name)),
	                () -> assertTrue(outputValues.contains(email)),
	                () -> assertTrue(outputValues.contains(currentAddress)),
	                () -> assertTrue(outputValues.contains(permanentAddress))
	            );
	        });
	    });

	}
}
