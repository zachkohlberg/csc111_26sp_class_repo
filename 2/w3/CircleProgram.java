public class CircleProgram {
    public static void main(String[] args) {
        // creating new circle objects
        Circle a = new Circle(0, 0, 10);
        // we can declare and init separately
        // usually don't want to do that
        Circle b;
        b = new Circle(5, 5, 5);

        // calling another function that takes a circle
        printCircle("A", a);
        printCircle("B", b);
    }

    static void printCircle(String name, Circle c) {
        // equivalent to the multiline string used in printf
        // String fmt = "Circle %s:\n" +
        //     "    x             = %.2f\n" +
        //     "    y             = %.2f\n" +
        //     "    radius        = %.2f\n" +
        //     "    area          = %.2f\n" +
        //     "    circumference = %.2f\n";

        System.out.printf(
                """
                Circle %s:
                    x             = %.2f
                    y             = %.2f
                    radius        = %.2f
                    area          = %.2f
                    circumference = %.2f
                """,
                name,
                // c's instance variables accessed with c.variable
                c.x,
                c.y,
                c.radius,
                // c's instance method called with c.method(...)
                c.getArea(),
                // Circle's static method called with Circle.method(...)
                Circle.getCircumference(c));
    }
}

