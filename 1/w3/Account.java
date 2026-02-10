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

    private String name;
    private int balance;

    // constructors

    // to avoid the need for "this."
    // public Account(String initName, int initBalance) {

    public Account(String name, int balance) {

        // this.name is the instance variable name
        // name is the parameter variable name
        // this. would be unnecessary if we changed the parameter names to differ from the instance variables
        this.name = name;
        this.balance = balance;

        // to avoid the need for "this.":
        // name = initName;
        // balance = initBalance;
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
        if (check.getAmount() > balance) {
            // not enough balance to withdraw
            return false;
        } else {
            balance -= check.getAmount();
            return true;
        }
    }

    public String format() {
        return String.format("%s: $%d.%02d", name, balance / 100, balance % 100);
    }

    // if we named it "toString" rather than format, then it would be used
    // automatically whenever we need to convert to a string
    public String toString() {
        return String.format("%s: $%d.%02d", name, balance / 100, balance % 100);
    }
}
