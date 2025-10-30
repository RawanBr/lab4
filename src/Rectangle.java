public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea () {
        return height * width;
    }

    public double calculateCircumference () {
        return 2 * (height + width);
    }

    public String toString () {
        return "A rectangle with height: " + height + " and width: " + width +
                "\nThe Area: " + calculateArea() + " | The perimeter: " + calculateCircumference();
    }
}
