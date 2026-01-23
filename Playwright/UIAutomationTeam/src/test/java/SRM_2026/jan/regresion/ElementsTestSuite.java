package SRM_2026.jan.regresion;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import SRM_2026.jan.regresion.elements.TextBoxTest;

@Suite
@SelectClasses({
    TextBoxTest.class
})
@IncludeTags("Regression")
@ExcludeTags("Smoke")
public class ElementsTestSuite {

}
