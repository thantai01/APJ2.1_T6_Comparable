package Shape;

public class Square extends Shape{
    private double side;

    public Square() { }
    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    void drawShape() {
        System.out.println(" Square { side = " + this.side + " }");
    }

    @Override
    double getArea() {
        return this.side * this.side;
    }

    @Override
    double getPerimeter() {
        return this.side * 4;
    }
}
