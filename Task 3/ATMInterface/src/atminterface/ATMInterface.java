/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atminterface;

import java.util.Scanner;

/**
 *
 * @author Themba Ntimane
 */
public class ATMInterface {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter initial balance for the bank account
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(initialBalance);

        // Create an ATM object with the bank account
        ATM atm = new ATM(bankAccount);

        boolean running = true;
        // Main loop to display ATM options and handle user input
        while (running) {
            System.out.println("\n Menu :");
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            // Switch statement to handle different user options
            switch (option) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    running = false; // Exit the loop if user chooses to exit
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close(); 
    }

}
