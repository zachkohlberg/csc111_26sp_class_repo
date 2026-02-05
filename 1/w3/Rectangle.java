// we'll avoid using "this" unless it's actually necessary
class Rectangle {
    // coordinates of lower-left corner
    double x, y;

    double width, height;

    // parameterized constructor lets us set the rectangle's properties
    Rectangle(double x, double y, double width, double height) {
        // instance variables and parameters have the same names, so we can use
        // "this." to indicate when we're referring to an instance variable

        // sets instance variable x equal to parameter x
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // can declare other constructors as long as the parameter types differ
    // a constructor with no parameters is called the "default constructor"
    Rectangle() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    // check for an intersection between two rectangles
    // this could be an instance method, but we're making it static
    static boolean checkOverlap(Rectangle a, Rectangle b) {
        // check for all the ways they could not overlap
        if (b.x + b.width < a.x) {
            return false;
        }
        if (a.x + a.width < b.x) {
            return false;
        }
        if (b.y + b.height < a.y) {
            return false;
        }
        if (a.y + a.height < b.y) {
            return false;
        }

        // if they don't not overlap, then they do overlap
        return true;
    }
}
