import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeAllAfterAllTest {

    private BankAccount account;
//@BeforeAll: Runs once before any test method. It is useful for expensive shared setup.
    @BeforeAll
    static void setUpAll() {
        System.out.println("Starting all tests");
    }

    @BeforeEach
    void setUp() {
        account = new BankAccount("Rahul", 1000);
        System.out.println("Preparing test");
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(300);
        assertEquals(700.0, account.getBalance());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test completed");
    }
//@AfterAll: Runs once after all test methods. It is useful for releasing shared resources.
    @AfterAll
    static void tearDownAll() {
        System.out.println("All tests completed");
    }
}
