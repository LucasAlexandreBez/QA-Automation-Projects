package releases.regression;

import org.junit.jupiter.api.Test;

import base.DesktopBase;
import config.PlaywrightTestBaseConfig;
import page.LoginPage;

public class RegressionTest extends DesktopBase {

	LoginPage loginPage = new LoginPage(page);
	
	@Test
	public void loginWihSuccessUsingAdminAccount() {
		loginPage.accessPage();
	}
}
