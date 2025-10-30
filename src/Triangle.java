public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calculateArea () {
        return (base * height) / 2;
    }

    public double calculateCircumference () {
        return base * 3;
    }

    public String toString () {
        return "A triangle with height: " + height + " and base: " + base +
                "\nThe Area: " + calculateArea() + " | The perimeter: " + calculateCircumference();
    }
}
