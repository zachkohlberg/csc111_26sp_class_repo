public class Convert {
    public static void main(String[] args) {
        // TODO: we might want to check whether we have any args before trying
        // to convert the first arg

        // convert arg to a number
        double cm = Double.parseDouble(args[0]);

        // convert from cm to in
        double in = cm / 2.54;

        // 2.54 cm/in
        //
        // cm ---> in
        //
        // cm * cm/in ---> cm^2/in
        // cm / cm/in ---> cm * in/cm ---> cm*in/cm ---> in

        // round and separate units with modulo
        long inchesRounded = Math.round(in);
        long feet = inchesRounded / 12;
        long inches = inchesRounded % 12;

        // print the answer
        System.out.printf("%d'%d\"\n", feet, inches);
    }
}
