package shapeGameProject;

import java.util.Scanner;

public class Game {
    {
        System.out.println("== Game Has Started ==");
    }

    private Scanner sc = new Scanner(System.in);

    public void selectShape() {
        System.out.println("\nPress 1 => TwoDShape");
        System.out.println("Press 2 => ThreeDShape");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                TwoDShape t1 = selectTwoDShape();
                if (t1 != null) {
                    t1.printDetails();
                    t1.printArea();
                    t1.printPerimeter();
                }
                break;
            case 2:
                ThreeDShape t2 = selectThreeDShape();
                if (t2 != null) {
                    t2.printDetails();
                    t2.printVolume();
                    t2.printLSA();
                    t2.printTSA();
                }
                break;
            default:
                System.out.println("Invalid Choice! Try Again...");
                selectShape();
        }
    }

    private TwoDShape selectTwoDShape() {
        System.out.println("\nPress 1 => Circle");
        System.out.println("Press 2 => Square");
        System.out.println("Press 3 => Rectangle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Radius: ");
                double r = sc.nextDouble();
                return new Circle(r);
            case 2:
                System.out.print("Enter Side: ");
                double s = sc.nextDouble();
                return new Square(s);
            case 3:
                System.out.print("Enter Length: ");
                double l = sc.nextDouble();
                System.out.print("Enter Width: ");
                double w = sc.nextDouble();
                return new Rectangle(l, w);
            default:
                System.out.println("Invalid Choice!");
                return selectTwoDShape();
        }
    }

    private ThreeDShape selectThreeDShape() {
        System.out.println("\nPress 1 => Cylinder");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Radius: ");
                double r = sc.nextDouble();
                System.out.print("Enter Height: ");
                double h = sc.nextDouble();
                return new Cylinder(r, h);
            default:
                System.out.println("Invalid Choice!");
                return selectThreeDShape();
        }
    }
}
