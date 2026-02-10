import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in centimeters: ");
        double cm = Double.parseDouble(input.nextLine());

        // convert to inches
        double in = cm / 2.54;

        // round
        long roundedInches = Math.round(in);

        // separate into feet and inches
        long feet = roundedInches / 12;
        long inches = roundedInches % 12;

        System.out.printf("%d'%d\"\n", feet, inches);

        input.close();
    }
}
