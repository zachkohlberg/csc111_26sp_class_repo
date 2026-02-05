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

    // methods

    public int getAmount() {
        return amount;
    }

    public String format() {
        return String.format("$%d.%02d", amount / 100, amount % 100);
    }
}
