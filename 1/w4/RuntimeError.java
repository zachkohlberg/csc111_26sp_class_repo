public class RuntimeError {
    public static void main(String[] args) {
        String two = IO.readln("Enter the number 2: ");

        if (two.equals("2")) {
            IO.println("Thanks, bye!");
        } else {
            IO.println("That's not two! Here's an error:");
            throw new RuntimeException("You didn't enter 2!!!!!!!! :(");
        }

        IO.println("End of program. We won't reach this if there's an error.");
    }
}
