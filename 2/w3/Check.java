// instance variables:
//     amount: int is the check value in cents
// constructors:
//     Check(int) initializes the check amount, but sets amount to zero if the argument is negative
// methods:
//     getAmount(): int returns the value of amount
//     format(): String returns a string representation of the check amount in the format $100.05.

public class Check {
    // instance variables

    private int amount;

    // constructors

    public Check(int amount) {
        if (amount < 0) {
            this.amount = 0;
        } else {
            this.amount = amount;
        }
    }

    // if we want to avoid the need for "this." on our instance variables
    // public Check(int initAmount) {
    //     if (initAmount < 0) {
    //         amount = 0;
    //     } else {
    //         amount = initAmount;
    //     }
    // }

    // methods

    public int getAmount() {
        return amount;
    }

    public String format() {
        return String.format("$%d.%02d", amount / 100, amount % 100);
    }
}
