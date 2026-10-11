
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeforeEachTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("Ashu", 1000);
    }

    @Test
    void testInitialBalance() {
        assertEquals(1000.0, account.getBalance());
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
}
