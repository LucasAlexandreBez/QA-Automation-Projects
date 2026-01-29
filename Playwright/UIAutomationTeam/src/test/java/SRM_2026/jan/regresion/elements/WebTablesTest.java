package SRM_2026.jan.regresion.elements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import io.qameta.allure.*;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.models.elements.WebTablesRegister;
import apps.demoQA.pages.DemoQaMenuPage;
import apps.demoQA.pages.elements.WebTablesPage;

@Epic("Regression - 2026")
@Feature("Element flows")
public class WebTablesTest extends DemoQATestBase{
	
	WebTablesRegister originalRegister = new WebTablesRegister("Cierra", "Vega", "39", "cierra@example.com", "10000", "Insurance");

	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	WebTablesPage webTablesPage = new WebTablesPage();
	
	/**
	 * Given a user access the Web Tables page
	 * <br>
	 * And user click on Add button
	 * <br>
	 * And system present a modal with First Name, Last Name, Email, Age, Salary and Department inputs
	 * <br>
	 * When user fulfill all the inputs with valid data
	 * <br>
	 * And click on Submit
	 * <br>
	 * Then system present the new register on the web table with the values provided by the user
	 */
	@Story("Web Tables flow")
	@DisplayName("Add a new register on web table with success")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@Owner("Lucas Alexandre")
	@Description(useJavaDoc = true)
	@Test
	public void createNewRegisterOnWebTableWithSuccess() {
		WebTablesRegister register = new WebTablesRegister("Test", "Automation 1", "20", "test@test.com", "1000", "QA");
		menuPage.accessWebTablesPage(page);
		webTablesPage.fillRegistrationForm(page, register);
		Allure.step("Verify if new register is added correctly", () -> {			
			assertNotNull(webTablesPage.getRowByValue(page, register),"Expected new register to be present in the web table");
		});
	}
	
	/**
	 * Given a user access the Web Tables page
	 * <br>
	 * And user search a register providing a valid value to Search input
	 * <br>
	 * And system present on the web table the registers based on value provided by user
	 * <br>
	 * And user click on Edit button at desired register
	 * <br>
	 * When system present a modal with First Name, Last Name, Email, Age, Salary and Department inputs fulfilled with the last saved value
	 * <br>
	 * And user update the desired value at First Name, Last Name, Email, Age, Salary and Department of the inputs
	 * <br>
	 * And user click on submit button
	 * <br>
	 * Then system present the updated register on the web table with the values provided by the user
	 */
	@Story("Web Tables flow")
	@DisplayName("Update a register on web table with success")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@Owner("Lucas Alexandre")
	@Description(useJavaDoc = true)
	@Test
	public void updateRegisterOnWebTableWithSuccess() {
		WebTablesRegister updatedRegister = new WebTablesRegister("Alden", "Vega", "20", "cierra@example.com", "10000", "Insurance");
		menuPage.accessWebTablesPage(page);
		
		webTablesPage.clickEditOnRow(page, originalRegister);
		webTablesPage.fillAgeInput(page, updatedRegister.getAge());
		webTablesPage.fillFirstNameInput(page, updatedRegister.getFirstName());
		webTablesPage.clickOnSubmitAtRegistrationForm(page);
		
		webTablesPage.searchRegisterUsingTheSearchInput(page, updatedRegister.getFirstName());
		Allure.step("Verify if register is correctly updated on Web Table", () -> {			
			assertNotNull(webTablesPage.getRowByValue(page, updatedRegister),"Expected updated register to be present in the web table");
		});
	}
	
	/**
	 * Given a user access the Web Tables page
	 * <br>
	 * And user search a register providing a valid value to Search input
	 * <br>
	 * And system present on the web table the registers based on value provided by user
	 * <br>
	 * When user click on Remove button at desired register
	 * <br>
	 * Then system remove register on the web table
	 */
	@Story("Web Tables flow")
	@DisplayName("Add a new register on web table with success")
	@Severity(SeverityLevel.NORMAL)
	@Tag("Regression")
	@Tag("Elements")
	@Owner("Lucas Alexandre")
	@Description(useJavaDoc = true)
	@Test
	public void removeRegisterOnWebTableWithSuccess() {
		menuPage.accessWebTablesPage(page);
		webTablesPage.clickDeleteOnRow(page, originalRegister);
		webTablesPage.searchRegisterUsingTheSearchInput(page, originalRegister.getFirstName());
		Allure.step("Verify if register is correctly updated on Web Table", () -> {			
			assertNull(webTablesPage.getRowByValue(page, originalRegister),"Didn't expected deleted register to be present in the web table");
		});
	}
}
