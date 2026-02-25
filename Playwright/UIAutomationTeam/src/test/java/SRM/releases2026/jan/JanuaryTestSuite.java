package SRM.releases2026.jan;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("January Test suite release")
@SelectPackages({
    "SRM.releases2026.jan.demoqa_regression"
})
public class JanuaryTestSuite {

}
