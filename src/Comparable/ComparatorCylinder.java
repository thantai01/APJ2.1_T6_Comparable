package Comparable;

import Shape.Cylinder;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCylinder extends Cylinder implements Comparator<Cylinder> {
    public int compare(Cylinder c1,Cylinder c2) {
        if(c1.getRadius() > c2.getRadius()) return 1;
        else if(c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}

class CylinderCompareTest {
    public static void main(String[] args) {
        Cylinder[] cylinders = new Cylinder[5];
        for (int i =0;i < 5;i++) {
            cylinders[i] = new Cylinder(Math.ceil(Math.random()*5),Math.ceil(Math.random()*10));
        }
        System.out.println("Pre-sort");
        for(Cylinder cylinder : cylinders) {
            System.out.println(cylinder.toString());
        }
        Comparator cylinderComparator = new ComparatorCylinder();
        Arrays.sort(cylinders, cylinderComparator);

        System.out.println("After-sort");
        for (Cylinder cylinder : cylinders) {
            System.out.println(cylinder.toString());
        }

    }
}
