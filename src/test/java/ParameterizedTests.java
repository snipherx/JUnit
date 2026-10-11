import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedTests {

    @ParameterizedTest
    @CsvSource({
            "100, 1100",
            "200, 1200",
            "500, 1500",
            "1000, 2000"
    })
    void shouldDepositCorrectAmount(
            double deposit,
            double expectedBalance) {

        BankAccount account = new BankAccount("Rahul", 1000);

        account.deposit(deposit);

        assertEquals(expectedBalance, account.getBalance());
    }
}
