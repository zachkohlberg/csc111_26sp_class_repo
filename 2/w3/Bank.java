// - create two new accounts with whatever names you want
// - print the accounts and their balances
// - ask the user for an amount to transfer from the first account to the
//   second and create a check with that amount
// - attempt to withdraw the money from the first account, and if the
//   withdraw succeeds then deposit the check in the second account
// - print the accounts and their balances again
//
// Account API:
//     Account(String name, int balance)
//     getName(): String
//     getBalance(): int
//     deposit(Check)
//     withdraw(Check): boolean
//     format(): String
// Check API:
//     Check(int amount)
//     getAmount(): int
//     format(): String

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // let us read input from system.in
        Scanner stdin = new Scanner(System.in);

        // create two new accounts with whatever names you want
        Account employer = new Account("Google", 10_000_00);
        Account employee = new Account("Bob", 100_00);

        // print the accounts and their balances
        // we added a toString to make these more convenient to print
        System.out.println(employer);
        System.out.println(employee);

        // prompt for an amount
        System.out.println("How much money does Bob get payed this week?");
        System.out.print("$ ");
        // alternative:
        // int dollars = Integer.parseInt(stdin.nextLine());
        int dollars = stdin.nextInt();

        // create a check
        Check paycheck = new Check(dollars * 100);

        // print the check
        // System.out.println(paycheck.format());

        // attempt to withdraw the money from the first account, and if the
        // withdraw succeeds then deposit the check in the second account
        if (employer.withdraw(paycheck)) {
            employee.deposit(paycheck);
            System.out.println("Withdrawal succeeded.");
        } else {
            System.out.println("Withdrawal failed.");
        }

        // print the accounts and their balances again
        System.out.println(employer);
        System.out.println(employee);

        // we might as well close it
        stdin.close();
    }
}
