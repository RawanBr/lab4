import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    boolean valid = true;

    while (valid) {
        System.out.println("What shape do you want to test?\n1- Circle\n2- Rectangle\n3- Triangle\n(ENTER 0 TO EXIT)");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the circle radius: ");
                double radius = input.nextDouble();
                Circle circle = new Circle(radius);

                System.out.println("------------------------------");
                System.out.println(circle.toString());
                System.out.println("------------------------------");
                break;

            case 2:
                System.out.println("Enter the height of the rectangle: ");
                double heigh = input.nextDouble();
                System.out.println("Enter the width of the rectangle: ");
                double width = input.nextDouble();
                Rectangle rectangle = new Rectangle(heigh, width);

                System.out.println("------------------------------");
                System.out.println(rectangle.toString());
                System.out.println("------------------------------");
                break;

            case 3:
                System.out.println("Enter the height of the triangle: ");
                double height = input.nextDouble();
                System.out.println("Enter the base of the triangle: ");
                double base = input.nextDouble();
                Triangle triangle = new Triangle(height, base);

                System.out.println("------------------------------");
                System.out.println(triangle.toString());
                System.out.println("------------------------------");
                break;

            default:
                if (choice == 0) {
                    valid = false;
                    break;
                }
                else {
                    System.out.println("------------------------------");
                    System.out.println("Invalid input, try again");
                    System.out.println("------------------------------");
                }
        }
    }



    }
}