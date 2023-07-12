public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber = 5;
    private int balance = 10;

    String accountType;

    int overdraft = 0;

    public BankAccount(){

    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getAccountType(){
        return this.accountType;
    }


    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;

    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void setDateOfBirth(String newDateOfBirth){
        this.dateOfBirth = newDateOfBirth;
    }
    public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }
    public void setBalance(int newBalance){
        this.balance = newBalance;
    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdrawal(int amount){
        if(balance-amount <= overdraft){
            System.out.println("You are out of money");
        } else {
            balance -= amount;
            return balance;
        }
        return balance;

    }
    public int payInterest(String accountType){
        if (accountType == "savings"){
            this.balance = balance +  balance*(10/100);
            return balance;
        }
        if (accountType == "normal"){
            this.balance = balance +  balance*(10/100);
            return balance;
        }

     return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setBalance(100);
        bankAccount1.payInterest("savings");
        System.out.println(bankAccount1.balance);

    }




}



