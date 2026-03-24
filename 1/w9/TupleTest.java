public class TupleTest {
    public static void main(String[] args) {
        Tuple<String, Integer> grade = new Tuple<>("A", 95);
        String letter = grade.getValue1();
        int number = grade.getValue2();

        System.out.println(letter + " (" + number + ")");

        Tuple<Integer, Integer> money = new Tuple<>(5, 57);
        int dollars = money.getValue1();
        int cents = money.getValue2();

        System.out.printf("$%d.%02d\n", dollars, cents);

        Tuple<String, Tuple<String, String>> name = new Tuple<>("Bob", new Tuple<>("B.", "Smith"));
        String first = name.getValue1();
        String middle = name.getValue2().getValue1();
        String last = name.getValue2().getValue2();

        System.out.printf("%s %s %s\n", first, middle, last);
    }
}
