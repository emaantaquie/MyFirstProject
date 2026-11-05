# MyFirstProject
This is a Java program that asks the user for the user's balance and asks how much they would like to withdraw, it then displays how much the user withdrew and the remaining balance. 

# Lab: ATM

This program reads user's balance and withdraw information, calculates the remaining balance, 
and displays how much user withdrew and the reamining balance.

## How to Run
1. Open the program in your IDE.
2. Enter starting balance and money withdrawal input.
3. View the calculated balance and withdrawal output.

## Example Input
345

## Example Output
Enter starting balance: 
345
Enter amount to withdraw (0 to exit):
90
Withdrew: 90.0 Balance: 255.0
Enter amount to withdraw (0 to exit):
0
GoodBye
##  Starter Code
Here’s the starter template you can use before adding the logic for calculations:

```java
import java.util.Scanner;

class BankAccount {
    double balance;

    // TODO A1: Add a constructor that sets balance

    // TODO A2: Add a method withdraw(double amount)
    //   - If amount <= balance: subtract and print
    //       "Withdrew $<amount>. Balance = $<balance>"
    //   - Else: print "Not enough funds!"
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO B1: Ask user for starting balance
        // TODO B2: Create a BankAccount object

        // TODO C1: Ask for amount to withdraw (0 to exit)
        // TODO C2: While amount != 0
        //   - Call withdraw(amount)
        //   - Ask for next amount

        // After loop ends:
        //   Print "Goodbye!"
    }
}


```



## Author
Emaan Taquie

Edit added by Sherry
## Collaboration Acknowledgement 
This project was reviewed and edited by Sherry on GitHub
