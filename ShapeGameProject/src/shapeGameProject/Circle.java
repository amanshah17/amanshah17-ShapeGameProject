package shapeGameProject;

public class Circle extends TwoDShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void printDetails() {
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius + " Unit");
    }

    @Override
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area + " Sq. Unit");
    }

    @Override
    public void printPerimeter() {
        double peri = 2 * Math.PI * radius;
        System.out.println("Perimeter: " + peri + " Unit");
    }
}
