package Shape;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() { }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void drawShape() {
        System.out.println(" Cylinder { height = " + this.height + super.getRadius());
    }

    double getVolume() {
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "} " +" with " + super.toString();
    }
}