package Chapter_7;

abstract class TwoDShape2{

    private double height;
    private double width;
    private double radius;

    TwoDShape2 (double r) { radius = r; }

    void SetRadius(double r) { radius = r; }
    double GetRadius() { return radius; }

    abstract double area();

}

class Circle extends TwoDShape2{

    Circle (double r){
        super (r);
    }

    double area () { return GetRadius() * GetRadius() * 3.14; }

}

public class CircleArea {
    public static void main(String [] args){

        Circle test1 = new Circle(4.5);
        System.out.println("Площадь test1 = " + test1.area());

    }
}
