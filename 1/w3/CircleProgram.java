public class CircleProgram {
    public static void main(String[] args) {
        // creating two circle variables and initializing them with new circles
        Circle a = new Circle(0, 0, 10);
        // we can split declaration and initialization into separate lines, but
        // we usually don't want to do that
        Circle b;
        b = new Circle(5, 5, 5);

        // calling another function that uses our circles
        printCircle("A", a);
        printCircle("B", b);
    }

    static void printCircle(String name, Circle c) {
        System.out.printf(
                """
                Circle %s:
                    x             = %.2f
                    y             = %.2f
                    radius        = %.2f
                    area          = %.2f
                    circumference = %.2f
                """,
                // can access c's instance variables with c.variable
                // can call c's instance methods with c.method(...)
                // we can also pass c to a static method in Circle (getCircumference)
                name,
                c.x,
                c.y,
                c.radius,
                // getArea in nonstatic, so it's accessed through the instance c
                c.getArea(),
                // getCircumference is static, so it's accessed through the class Circle
                Circle.getCircumference(c));
    }
    // this is equivalent to the above multiline string literal:
    // String fmt = "Circle %s:\n" +
    //     "    x             = %.2f\n" +
    //     "    y             = %.2f\n" +
    //     "    radius        = %.2f\n" +
    //     "    area          = %.2f\n" +
    //     "    circumference = %.2f\n";
}

