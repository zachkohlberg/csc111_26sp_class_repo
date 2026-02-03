// will avoid using this when it isn't necessary
class Rectangle {
    // instance variables

    // coordinates of lower-left corner
    double x, y;

    double width, height;

    // constructors

    Rectangle(double x, double y, double width, double height) {
        // set instance variable x equal to parameter x
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // we can declare other constructors as long as their parameter types differ
    // a constructor with no parameters is called a "default constructor"
    Rectangle() {
        // no need for this. because there's only one x, y, etc. we could mean
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    // methods

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    // this operates on two rectangles, so it will be static
    // the instance version would just take the second rectangle as a parameter
    // and use "this" for the first
    static boolean checkOverlap(Rectangle a, Rectangle b) {
        // a's right edge is left of b's left edge
        if (a.x + a.width < b.x) {
            return false;
        }
        if (b.x + b.width < a.x) {
            return false;
        }
        if (a.y + a.height < b.y) {
            return false;
        }
        if (b.y + b.height < a.y) {
            return false;
        }

        // if they're not NOT overlapping, then they're overlapping
        return true;
    }
    // calling above method:
    // Rectangle.checkOverlap(r1, r2)
    // if it were an instance method:
    // r1.overlaps(r2)
}
