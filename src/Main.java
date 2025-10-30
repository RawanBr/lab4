import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        ArrayList<Shape> tests = new ArrayList<>();


    boolean valid = true;

    while (valid) {
        System.out.println("What shape do you want to test?\n1- Circle\n2- Rectangle\n3- Triangle\n4- View the tests history\n(ENTER 0 TO EXIT)");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle : ");
                double radius = input.nextDouble();
                Circle circle = new Circle(radius);
                tests.add(circle);

                System.out.println("------------------------------");
                System.out.println(circle);
                System.out.println("------------------------------");
                break;

            case 2:
                System.out.println("Enter the height of the rectangle: ");
                double heigh = input.nextDouble();
                System.out.println("Enter the width of the rectangle: ");
                double width = input.nextDouble();
                Rectangle rectangle = new Rectangle(heigh, width);
                tests.add(rectangle);

                System.out.println("------------------------------");
                System.out.println(rectangle);
                System.out.println("------------------------------");
                break;

            case 3:
                System.out.println("Enter the height of the triangle: ");
                double height = input.nextDouble();
                System.out.println("Enter the base of the triangle: ");
                double base = input.nextDouble();
                Triangle triangle = new Triangle(height, base);
                tests.add(triangle);

                System.out.println("------------------------------");
                System.out.println(triangle);
                System.out.println("------------------------------");
                break;

            case 4:
                System.out.println("------------------------------");

                System.out.println("Here are all the shapes you tested before: \n");
                for (Shape test : tests) {
                    System.out.println(test + "\n");
                }
                System.out.println("------------------------------");
                break;

            default:
                System.out.println("------------------------------");
                if (choice == 0) {
                    System.out.println("        PROGRAM ENDED");
                    System.out.println("------------------------------");
                    valid = false;
                    break;
                }
                else {
                    System.out.println("   Invalid input, try again");
                    System.out.println("------------------------------");
                }
        }
    }


    }
}