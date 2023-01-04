package com.atm.transaction;

// import required classes and packages   
import java.util.Scanner;

// create ATM class to implement the ATM functionality 
public class ATM {

	// main method starts
	public static void main(String[] args) {

		// declare and initialize balance, withdraw, and deposit
		int balance = 100000, withdraw, deposit;

		// create scanner class object to get choice of user
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*Automated Teller Machine=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.println("\n===========================================================");
			System.out.print("Choose the operation you want to perform: ");
			System.out.println("");

			// get choice from user
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter money to be withdrawn:");
				System.out.println("");
				// get the withdrawal money from user
				withdraw = sc.nextInt();

				// check whether the balance is greater than or equal to the withdrawal amount
				if (balance >= withdraw) {

					// remove the withdrawal amount from the total balance
					balance = balance - withdraw;

					System.out.println("Please collect your money...");
					System.out.println("===========================================================");
				} else {

					// show custom error message
					System.out.println("Insufficient Balance");
					System.out.println("===========================================================");
				}

				System.out.println("");
				break;

			case 2:

				System.out.print("Enter money to be deposited:");

				// get deposit amount from user
				deposit = sc.nextInt();

				// add the deposit amount to the total balance
				balance = balance + deposit;

				System.out.println("Your Money has been successfully deposited");
				System.out.println("===========================================================");
				System.out.println("");
				break;

			case 3:
				// displaying the total balance of the user
				System.out.println("Balance : " + balance);
				System.out.println("===========================================================");
				System.out.println("");
				break;

			case 4:
				// exit from the menu
				System.exit(0);

			}
		}
	}
}
