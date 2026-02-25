package SRM.releases2026.jan.demoqa_regression.elements;

import static org.junit.jupiter.api.Assertions.*;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import apps.demoQA.DemoQATestBase;
import apps.demoQA.pages.DemoQaMenuPage;
import apps.demoQA.pages.elements.BrokenLinksImagesPage;

@Epic("Regression - 2026")
@Feature("Element flows")
public class BrokenLinksImagesTest  extends DemoQATestBase {

	DemoQaMenuPage menuPage = new DemoQaMenuPage();
	BrokenLinksImagesPage brokenLinksImagesPage = new BrokenLinksImagesPage();
	
	/**
	 * Given a user access Broken Links - Images Page 
	 * <br>
	 * When user goes to image areas
	 * <br>
	 * Then system should present on screen a visible image 
	 */
	@Story("Upload And Download flow")
	@Owner("Lucas Alexandre")
	@Severity(SeverityLevel.MINOR)
	@Tag("Regression")
	@Tag("Elements")
	@DisplayName("Verify if user access Broken Links - Images Page then system present on screen a visible image")
	@Description(useJavaDoc = true)
	@Test
	public void verifyNotBrokenImage() {
	    menuPage.accessBrokenLinksImagesPage(page);
	    Allure.step("Check valid image", () -> {	    	
	    	assertTrue(brokenLinksImagesPage.verifyBrokenImage(page));
	    });
	}

}
