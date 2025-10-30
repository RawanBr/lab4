public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea () {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference () {
        return 2 * Math.PI * radius;
    }

    public String toString () {
        return "A circle with radius " + radius +
                "\nThe Area: " + calculateArea() +
                " | The Circumference: " + calculateCircumference();
    }
}
