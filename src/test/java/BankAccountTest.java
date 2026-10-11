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
/*

        JUnit Test Explanation:

       -> @Test
          Marks this method as a JUnit test case.



        ->new BankAccount("Ashu", 1000)
          Creates a bank account for Ashu with an initial balance of ₹1,000.

        ->account.deposit(500)
          Deposits ₹500 into the account.

        ->assertEquals(1500.0, bankAccount.getBalance())
          Checks whether the actual balance is equal to the expected balance of ₹1,500.

        ->If both values match, the test passes; otherwise, it fails.
        */
    }

}

