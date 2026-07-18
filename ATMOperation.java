import java.util.Scanner;

public class ATMOperation {

    Scanner sc = new Scanner(System.in);

    public boolean verifyPin(Account account) {
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (pin == account.pin) {
            return true;
        } else {
            System.out.println("Wrong PIN!");
            return false;
        }
    }

    public void deposit(Account account) {
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        account.balance += amount;
        System.out.println("Deposit Successful!");
    }

    public void withdraw(Account account) {
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (amount <= account.balance) {
            account.balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}