package Comparable;

import Shape.Circle;

import java.util.Arrays;


public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() { }

    public ComparableCircle(double radius) {
        super(radius);
    }


    public int compareTo(ComparableCircle o) {
        if (getRadius() >o.getRadius()) return 1;
        else if(getRadius() <o.getRadius()) return -1;
        else return 1;
    }
}
class ComparableCircleTest{
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[5];
        for(int i =0; i < 5; i++) {
            circles[i]= new ComparableCircle(Math.ceil(Math.random()*10));
        }
        System.out.println("Pre-sort");
        for (ComparableCircle circle : circles) {
            System.out.println(circle.toString());
        }
        Arrays.sort(circles);

        System.out.println("After-sort");
        for (ComparableCircle circle : circles) {
            System.out.println(circle.toString());
        }

    }
}



