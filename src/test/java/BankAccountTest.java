import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    void testWithdraw()
    {
        //Arrange
        BankAccount account=new BankAccount("Ashutosh",2000);
        //Act
        account.withdraw(700);
        //Assert
        assertEquals(1300,account.getBalance());

    }

    @Test
    void testBalanceIsPositive()
    {
        //Arrange
        BankAccount account=new BankAccount("Ashu",1000);
        //Act
        account.withdraw(800);
        //Assert
        assertTrue(account.getBalance()>0);  //Check Condition
    }
    @Test
    void testBalanceIsNotNegative()
    {
        BankAccount account=new BankAccount("Ashu",100);
        assertFalse(account.getBalance()<0);
    }
    @Test
    void testNullValue()
    {
        String value=null;
        assertNull(value);
    }
    @Test
    void testInvalidDeposit()
    {
        BankAccount account=new BankAccount("AShu",500);
        assertThrows(IllegalArgumentException.class,()->account.deposit(0));
    }
}

