import java.util.Scanner;

public class ATMSimulationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account();
        ATMOperation atm = new ATMOperation();

        // Verify PIN
        if (!atm.verifyPin(account)) {
            System.out.println("Access Denied!");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.showBalance();
                    break;

                case 2:
                    atm.deposit(account);
                    break;

                case 3:
                    atm.withdraw(account);
                    break;

                case 4:
                    System.out.println("Thank You for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}