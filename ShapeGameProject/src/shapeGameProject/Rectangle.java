package shapeGameProject;

public class Rectangle extends TwoDShape {
    private double l, w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public void printDetails() {
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + l + " Unit");
        System.out.println("Width: " + w + " Unit");
    }

    @Override
    public void printArea() {
        double area = l * w;
        System.out.println("Area: " + area + " Sq. Unit");
    }

    @Override
    public void printPerimeter() {
        double peri = 2 * (l + w);
        System.out.println("Perimeter: " + peri + " Unit");
    }
}
