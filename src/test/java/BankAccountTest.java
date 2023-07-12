import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount();


    }

    @Test
    public void canGetAndSetFirstName(){
        bankAccount.setFirstName("testFirstName");
        String actual = bankAccount.getFirstName();
        String expected = "testFirstName";
        assertThat(actual).isEqualTo(expected);

    }
    @Test
    public void canGetAndSetLastName(){
        bankAccount.setLastName("testLastName");
        String actual = bankAccount.getLastName();
        String expected = "testLastName";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canGetAndSetDateOfBirth(){
        bankAccount.setDateOfBirth("22nd of April");
        String actual = bankAccount.getDateOfBirth();
        String expected = "22nd of April";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canGetAndSetAccountNumber(){
        bankAccount.setAccountNumber(5);
        int actual = bankAccount.getAccountNumber();
        int expected = 5;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canGetAndSetBalance(){
        bankAccount.setBalance(10);
        int actual = bankAccount.getBalance();
        int expected = 10;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canDeposit(){
        bankAccount.deposit(20);
        int actual = bankAccount.getBalance();
        int expected = 30;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canWithdrawal(){
        bankAccount.withdrawal(3);
        int actual = bankAccount.getBalance();
        int expected = 7;
        assertThat(actual).isEqualTo(expected);
    }
//    @Test
//    public void canAddInterest(){
//        bankAccount.payInterest("savings");
//        int actual = bankAccount.getBalance();
//        int expected = 11;
//        assertThat(actual).isEqualTo(expected);
//    }












}
