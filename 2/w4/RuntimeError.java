public class RuntimeError {
    public static void main(String[] args) {
        String two = IO.readln("Please enter the number 2: ");

        if (two.equals("2")) {
            IO.println("Thanks, bye!");
        } else {
            IO.println("That's not 2, here's an error.");
            throw new RuntimeException("user didn't type 2");
        }

        IO.println("End of program. This message won't show up if an exception occurs earlier.");
    }
}
