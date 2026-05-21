package com.krishna;

import java.util.Scanner;

public class BankApplications {

    static float account1Balance = 10050;
    static float account2Balance = 5000;

    // Greet customer
    public static void greetCustomer() {
        System.out.println("Hello Customer!! Hope you are doing good!");
    }

    // Show balances
    public static void showBalances() {
        System.out.println("Account 1 Balance: " + account1Balance);
        System.out.println("Account 2 Balance: " + account2Balance);
    }

    // Deposit into account 1
    public static void deposit(int amount) {
        account1Balance += amount;
        System.out.println(amount + " deposited successfully into Account 1!");
    }

    // Withdraw from account 1
    public static void withdraw(int amount) {
        if (account1Balance >= amount) {
            account1Balance -= amount;
            System.out.println(amount + " withdrawn successfully from Account 1!");
        } else {
            System.out.println("Insufficient balance in Account 1!");
        }
    }

    // Transfer from account 1 to account 2
    public static void transfer(int amount) {
        if (account1Balance >= amount) {
            account1Balance -= amount;
            account2Balance += amount;
            System.out.println(amount + " transferred successfully from Account 1 to Account 2!");
        } else {
            System.out.println("Insufficient balance in Account 1! Transfer failed.");
        }
    }

    // Thank you message
    public static void thankYou() {
        System.out.println("Thank you for visiting our bank!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greetCustomer();
        showBalances();

        System.out.println("\nEnter amount to deposit into Account 1:");
        int depositAmount = sc.nextInt();
        deposit(depositAmount);
        showBalances();

        System.out.println("\nEnter amount to withdraw from Account 1:");
        int withdrawAmount = sc.nextInt();
        withdraw(withdrawAmount);
        showBalances();

        System.out.println("\nEnter amount to transfer from Account 1 to Account 2:");
        int transferAmount = sc.nextInt();
        transfer(transferAmount);
        showBalances();

        thankYou();
        sc.close();
    }
}