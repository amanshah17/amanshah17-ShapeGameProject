package shapeGameProject;

public class Cylinder extends ThreeDShape {
    private double r, h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public void printDetails() {
        System.out.println("Shape: Cylinder");
        System.out.println("Radius: " + r + " Unit");
        System.out.println("Height: " + h + " Unit");
    }

    @Override
    public void printVolume() {
        double v = Math.PI * r * r * h;
        System.out.println("Volume: " + v + " Cubic Unit");
    }

    @Override
    public void printLSA() {
        double lsa = 2 * Math.PI * r * h;
        System.out.println("LSA: " + lsa + " Sq. Unit");
    }

    @Override
    public void printTSA() {
        double tsa = 2 * Math.PI * r * (r + h);
        System.out.println("TSA: " + tsa + " Sq. Unit");
    }
}
