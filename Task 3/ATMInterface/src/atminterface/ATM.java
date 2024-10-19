/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atminterface;

/**
 *
 * @author Themba Ntimane
 */
public class ATM  {
    private BankAccount account; 

    public ATM(BankAccount account) {
        this.account = account;
    }
     // Method to check the balance of the bank account
    public void checkBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }

    // Method to deposit money into the bank account
    public void deposit(double amount) {
        account.deposit(amount);
    }

    // Method to withdraw money from the bank account
    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}
