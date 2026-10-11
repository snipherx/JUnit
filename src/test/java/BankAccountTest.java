import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    void testDeposit()
    {
        //Arrange -> Initial Input
        BankAccount bankAccount=new BankAccount("Ashu",1000);
        //Act -> Action Performed
        bankAccount.deposit(500);
        //Assert -> Expected Output
        assertEquals(1500,bankAccount.getBalance());
    }

}
