package Shape;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    void drawShape() {
        System.out.println("Rectangle { width = " + this.width + ", height = " + this.height + " }" );
    }

    @Override
    double getArea() {
        return this.height*this.width;
    }

    @Override
    double getPerimeter() {
        return (this.height+this.width)*2;
    }
}
