package ATMInterface;

import java.util.Scanner;

public class ATMInterface {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 10000.0;
        int userPin;

        System.out.println("Welcome to Java ATM!");
        System.out.print("Enter your 4-digit PIN: ");
        userPin = sc.nextInt();

        if (userPin != pin) {
            System.out.println("Incorrect PIN. Access Denied.");
            return;
        }

        int option;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using Java ATM!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 4);
    }

}
