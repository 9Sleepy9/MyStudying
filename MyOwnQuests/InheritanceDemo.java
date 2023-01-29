package MyOwnQuests;

import java.util.ArrayList;

interface Shape {

    double getVolume();

}

class Pyramid implements Shape {

    private double volume;
    private double s;
    private double h;

    Pyramid (double s1, double h1) {

        volume = (h1 * s1 * 4 / 3);
        s = s1;
        h = h1;
    }

    public double getVolume(){
        return volume;
    }

}

class Box implements Shape {

    private int counter = 0;
    private Shape[] shapes;
    private double available;

    Box (double v1) {
        available = v1;
         shapes = new Shape[(int) available];
    }

    public double getVolume(){
        return available;
    }

    public boolean add (Shape obj) {

        if (available >= obj.getVolume()) {
            shapes [counter] = obj;
            counter++;
            available -= obj.getVolume();
            if (obj.toString().indexOf("Cylinder") > 0) {
                System.out.println("Добавлен цилиндр объёмом: " + obj.getVolume());
                return true;
            }
            if (obj.toString().indexOf("Ball") > 0) {
                System.out.println("Добавлен шар объёмом: " + obj.getVolume());
                return true;
            }
        }
        return false;
    }

}

abstract class SolidOfRevolution implements Shape {

    private double volume;
    private double radius;

    SolidOfRevolution (double r, double v) {
        volume = v;
        radius = r;
    }

    public double getRadius() {
        System.out.println("Радиус фигуры = " + radius);
        return radius;
    }

}

class Cylinder extends SolidOfRevolution {

    private double volume;
    private double height;

    Cylinder (double h, double r) {
        super(r, (Math.PI * r * r * h) );
        volume = Math.PI * r * r * h;
        height = h;
    }

    public double getVolume(){
        return volume;
    }

}

class Ball extends SolidOfRevolution {

    private double volume;

    Ball (double r) {
        super(r, (Math.PI * Math.pow(r, 3) * 4 / 3));
        volume = Math.PI * Math.pow(r, 3) * 4 / 3;
    }

    public double getVolume(){
        return volume;
    }

}


public class InheritanceDemo {
    public static void main(String[] args) {
        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2, 2);
        Pyramid pyramid = new Pyramid(100, 100);

        Box box = new Box(1000);

        System.out.println(box.add(ball)); // ok
        System.out.println(box.add(cylinder)); // ok
        System.out.println(box.add(pyramid)); // failed
    }
}
