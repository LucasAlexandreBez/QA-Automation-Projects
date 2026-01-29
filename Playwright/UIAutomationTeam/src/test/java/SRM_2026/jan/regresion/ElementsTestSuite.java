package SRM_2026.jan.regresion;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import SRM_2026.jan.regresion.elements.BrokenLinksImagesTest;
import SRM_2026.jan.regresion.elements.ButtonsTest;
import SRM_2026.jan.regresion.elements.CheckBoxTest;
import SRM_2026.jan.regresion.elements.DynamicPropertiesTest;
import SRM_2026.jan.regresion.elements.LinksTest;
import SRM_2026.jan.regresion.elements.RadioButtonTest;
import SRM_2026.jan.regresion.elements.TextBoxTest;
import SRM_2026.jan.regresion.elements.UploadAndDownloadTest;
import SRM_2026.jan.regresion.elements.WebTablesTest;

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
public class ElementsTestSuite {
}
