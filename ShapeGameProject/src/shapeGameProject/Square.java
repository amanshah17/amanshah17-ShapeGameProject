package shapeGameProject;

public class Square extends TwoDShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void printDetails() {
        System.out.println("Shape: Square");
        System.out.println("Side: " + side + " Unit");
    }

    @Override
    public void printArea() {
        double area = side * side;
        System.out.println("Area: " + area + " Sq. Unit");
    }

    @Override
    public void printPerimeter() {
        double peri = 4 * side;
        System.out.println("Perimeter: " + peri + " Unit");
    }
}
