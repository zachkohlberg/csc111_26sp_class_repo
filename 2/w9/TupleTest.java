public class TupleTest {
    public static void main(String[] args) {
        Tuple<String, Integer> grade = new Tuple<>("A", 95);
        String letter = grade.v1();
        int number = grade.v2();

        System.out.printf("%s (%d)\n", letter, number);

        Tuple<Integer, Integer> money = new Tuple<>(10, 53);
        int dollars = money.v1();
        int cents = money.v2();

        System.out.printf("$%d.%02d\n", dollars, cents);

        Tuple<String, Tuple<String, String>> name = new Tuple<>("Bob", new Tuple<>("B.", "Smith"));
        String first = name.v1();
        String middle = name.v2().v1();
        String last = name.v2().v2();

        System.out.printf("%s %s %s\n", first, middle, last);
    }
}
