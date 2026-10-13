import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        BankAccount.class,
        BeforeEachAfterEachTest.class,
        BeforeAllAfterAllTest.class,
        ParameterizedTests.class
})
public class BankAccountTestSuite {
}