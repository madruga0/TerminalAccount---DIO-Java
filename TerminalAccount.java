package edu.pedro.desafios.ContaBanco;

import java.util.Scanner;

/**
 * @author  Pedro Madruga
 */

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberAccount;
        String agency;
        String clientName;
        double balance;

        System.out.print("Enter bank account: ");
        numberAccount = sc.nextInt();
        System.out.print("Enter agency: ");
        agency = sc.next();
        System.out.print("Enter client name: ");
        clientName = sc.next();
        sc.next(); // clean buffer
        System.out.print("Enter your balance: ");
        balance = sc.nextDouble();

        System.out.println("Hello " + clientName + ", thanks for creating an account in our bank. Your agency is "
                + agency + ", account " + numberAccount + ", and your balance $" + String.format("%.2f", balance)
                + " is available for withdrawal.");

        sc.close();
    }
}


//TODO: learn about and import the Scanner class

//TODO: Display messages to our user

//TODO: Use the scanner to get the values entered in terminal

//TODO: Display the "account created" message
