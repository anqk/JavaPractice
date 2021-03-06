package day3;

public class Account {


    private String accountHolderNumber;  //default null
    private String accountNumber; // default null
    private double accountBalance; // default 0.0

    public String getAccountHolderNumber() {
        return accountHolderNumber;
    }

    public void setAccountHolderNumber(String accountHolderNumber) {
        this.accountHolderNumber = accountHolderNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

//    public void setAccountBalance(double accountBalance) {
//        this.accountBalance = accountBalance;
//    }

    //Behaviour
    public void transferBalance(Account from,Account to, double amountToBeTransferred){
        //Transferring balance logic
        //Logic to check if balance is available
        from.accountBalance -=amountToBeTransferred;  //accountBalance = accountBalance - amountToBeTransferred
        to.accountBalance -=amountToBeTransferred;  //accountBalance = accountBalance - amountToBeTransferred
    }

    public void deposit(Account a, double amountToBeDeposited){
        //Logic to check negative balance deposited
        a.accountBalance += amountToBeDeposited;
    }


}
