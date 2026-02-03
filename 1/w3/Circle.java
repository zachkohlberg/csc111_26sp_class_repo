// defines a type named "Circle"
class Circle {
    // instance variables
    // all will default to 0.0 if not initialized
    double x, y;
    double radius;

    // constructor
    // implicitly has a parameter "Circle this", which is the new circle it's
    // initializing/constructing
    Circle(double initX, double initY, double initRadius) {
        // you can leave out "this." most of the time
        // it's usually just used to resolve ambiguity when a parameter name
        // conflicts with an instance variable
        // I'm using "this." to make sure it's clear in the examples that we
        // already have a Circle object (this) whose variables we can modify
        this.x = initX;
        this.y = initY;
        this.radius = initRadius;
    }

    // an instance method
    // implicitly has access to the circle instance you called it on (this)
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // a static method
    // does not implicitly have access to a circle instance, so it needs to
    // declare a parameter to get one
    static double getCircumference(Circle c) {
        return 2 * Math.PI * c.radius;
    }

    // this is how we'd normally write getCircumference:
    // double getCircumference() {
    //     return 2 * Math.PI * this.radius;
    // }
}

