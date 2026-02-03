// declare the new Circle type
class Circle {
    // declare instance variables
    double x, y;
    double radius;

    // create a constructor to initialize each instance variable
    Circle(double initX, double initY, double initRadius) {
        // constructor implicitly receives the object it's initializing
        // "this" refers to the object, but it's optional in most situations
        this.x = initX;
        this.y = initY;
        this.radius = initRadius;
    }

    // create an instance method
    double getArea() {
        // again, we implicitly have an instance of Circle called "this"
        return Math.PI * this.radius * this.radius;
    }

    // create a static method
    // static methods don't get an implicit instance passed as "this"
    static double getCircumference(Circle c) {
        // if we want a circle in this static method, then we need to make it
        // one of our parameters
        return 2 * Math.PI * c.radius;
    }

    // instance method version of getCircumference
    // double getCircumference() {
    //     return 2 * Math.PI * this.radius;
    // }
}

