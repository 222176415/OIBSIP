package atminterface;

/**
 * @author Themba Ntimane
 * BankAccount Class Keeps track of Balance and contain methods such as Withdraw and Deposit.
 */
public class BankAccount {

    private double balance;
//Set Method to initialize the balance
    public void setBalance(double initialBalance) {
        this.balance = initialBalance;
    }
//Get Method to get the Balance from the bank Account 

    public double getBalance() {
        return balance;
    }

//Parametirize Constructor to initialize the bank account with initial Balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //Deposit Method to deposit Mone yinto the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful . New Balane : " + balance);
    }
    //Withdrawal Method ,To Withdrw Money from the Bank Account 

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
            return false;
        }
    }

}
