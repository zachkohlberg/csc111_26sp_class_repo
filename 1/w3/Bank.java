// - create two new accounts with whatever names you want
// - print the accounts and their balances
// - ask the user for an amount to transfer from the first account to the
//   second and create a check with that amount
// - attempt to withdraw the money from the first account, and if the
//   withdraw succeeds then deposit the check in the second account
// - print the accounts and their balances again
// Check API
//     Check(int amount)
//     getAmount(): int
//     format(): String
// Account API
//     Account(String name, int balance)
//     getName(): String
//     getBalance(): int
//     deposit(Check)
//     withdraw(Check): boolean
//     format(): String

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // get a scanner to read from system.in
        Scanner stdin = new Scanner(System.in);

        // create two new accounts, names and balances don't matter
        Account employer = new Account("Google", 10_000_00);
        Account employee = new Account("Bob", 100_00);

        // use format to print the accounts
        // added a toString so we don't have to call format manually
        System.out.println(employer);
        System.out.println(employee);

        // prompt for check amount
        System.out.println("How much money will Google pay Bob this week?");
        System.out.print("$ ");
        // alternative with parseInt:
        // int cents = Integer.parseInt(stdin.nextLine());
        int dollars = stdin.nextInt();

        // create check, converting to cents
        Check paycheck = new Check(dollars * 100);

        // withdraw, then deposit if successful
        if (employer.withdraw(paycheck)) {
            System.out.println("Withdrawal successful!");
            employee.deposit(paycheck);
        } else {
            System.out.println("Withdrawal failed!");
        }

        // print accounts again
        System.out.println(employer);
        System.out.println(employee);

        // close the scanner, why not?
        stdin.close();
    }
}
