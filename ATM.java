package atm.project;
import java.util.Scanner;
public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static int balance = 10000;

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        } while (choice != 4);
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    private static void withdrawMoney() {
        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance, please try again");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ", your new balance is " + balance);
        }
    }

    private static void depositMoney() {
        System.out.print("Enter the amount to deposit: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("Successfully deposited " + amount + ", your new balance is " + balance);
    }

}


/*
 * OUTPUT
 * Welcome to the ATM
1. Check Balance
2. Withdraw Money
3. Deposit Money
4. Exit
Enter your choice: 3
Enter the amount to deposit: 20000
Successfully deposited 20000, your new balance is 30000
Enter your choice: 1
Your current balance is: 30000
Enter your choice: 2
Enter the amount to withdraw: 1000
Successfully withdrew 1000, your new balance is 29000
Enter your choice: 1
Your current balance is: 29000
Enter your choice: 4
Thank you for using the ATM

 */
