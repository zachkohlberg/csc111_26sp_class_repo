// instance variables:
//     balance: int is the account balance in cents
//     name: String is the name of the account holder
// constructors:
//     Account(String, int) initializes the balance and name
// methods:
//     getName(): String returns name
//     getBalance(): int returns balance
//     deposit(Check): void adds the check’s amount to the account’s balance
//     withdraw(Check): boolean subtracts the check’s amount from the account’s balance unless the amount is greater than the balance, returns whether the withdraw succeeded
//     format(): String returns a string with the account name and balance formatted like this: “Alice: $100.05”

public class Account {
    // instance variables

    private int balance;
    private String name;

    // constructors

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // methods

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(Check check) {
        balance += check.getAmount();
    }

    public boolean withdraw(Check check) {
        if (balance < check.getAmount()) {
            return false;
        } else {
            balance -= check.getAmount();
            return true;
        }
    }

    public String format() {
        return String.format("%s: $%d.%02d", name, balance / 100, balance % 100);
    }

    // adding a toString makes it more convenient to print Account
    public String toString() {
        return String.format("%s: $%d.%02d", name, balance / 100, balance % 100);
    }
}
