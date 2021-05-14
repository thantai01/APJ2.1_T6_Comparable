package Shape;

public class Circle extends Shape{
    private double radius;

    public Circle() { }

    public Circle(double radius) { this.radius = radius; }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void drawShape() {
        System.out.println("Circle { radius = " + this.radius + " }");
    }

    @Override
    double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} ";
    }
}
