//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class BankAccount {
    double balance;

    // TODO A1: Add a constructor that sets balance
    BankAccount(double b) {
        balance = b;
    }

    // TODO A2: Add a method withdraw(double amount)
    //   - If amount <= balance: subtract and print
    //       "Withdrew $<amount>. Balance = $<balance>"
    //   - Else: print "Not enough funds!"

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrew: " + amount + " Balance: " + balance);

        } else {
            System.out.println("Not enough funds!");

        }
    }
}




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO B1: Ask user for starting balance
        // TODO B2: Create a BankAccount object
        System.out.println("Enter starting balance: ");
        double startBalance = sc.nextDouble();
        BankAccount bank1 = new BankAccount(startBalance);



        // TODO C1: Ask for amount to withdraw (0 to exit)
        // TODO C2: While amount != 0
        //   - Call withdraw(amount)
        //   - Ask for next amount

        System.out.println("Enter amount to withdraw (0 to exit):");
        double amount = sc.nextDouble();
        while( amount != 0) {
            bank1.withdraw(amount);
            System.out.println("Enter amount to withdraw (0 to exit):");
            amount = sc.nextDouble();
        }

        // After loop ends:
        //   Print "Goodbye!"
        System.out.println("Goodbye");



    }
}