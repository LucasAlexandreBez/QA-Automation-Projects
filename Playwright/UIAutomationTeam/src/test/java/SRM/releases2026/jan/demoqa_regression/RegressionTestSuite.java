package SRM.releases2026.jan.demoqa_regression;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import SRM.releases2026.jan.demoqa_regression.elements.BrokenLinksImagesTest;
import SRM.releases2026.jan.demoqa_regression.elements.ButtonsTest;
import SRM.releases2026.jan.demoqa_regression.elements.CheckBoxTest;
import SRM.releases2026.jan.demoqa_regression.elements.DynamicPropertiesTest;
import SRM.releases2026.jan.demoqa_regression.elements.LinksTest;
import SRM.releases2026.jan.demoqa_regression.elements.RadioButtonTest;
import SRM.releases2026.jan.demoqa_regression.elements.TextBoxTest;
import SRM.releases2026.jan.demoqa_regression.elements.UploadAndDownloadTest;
import SRM.releases2026.jan.demoqa_regression.elements.WebTablesTest;

@Suite
@SelectClasses({
    BrokenLinksImagesTest.class,
    ButtonsTest.class,
    CheckBoxTest.class,
    DynamicPropertiesTest.class,
    LinksTest.class,
    RadioButtonTest.class,
    TextBoxTest.class,
    UploadAndDownloadTest.class,
    WebTablesTest.class
})
@IncludeTags("Regression")
@ExcludeTags("Smoke")
public class RegressionTestSuite {
}
