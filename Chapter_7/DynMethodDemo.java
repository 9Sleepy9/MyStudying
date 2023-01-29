package Chapter_7;

import org.w3c.dom.css.Rect;

class TwoDShape {

    private double width;
    private double height;
    private String name;

    TwoDShape(){
        width = height = 0;
        name = "none";
    }

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape (TwoDShape obj) {
        width = obj.width;
        height = obj.height;
        name = obj.name;
    }

    double getWidth () { return width; }
    double getHeight() { return height; }
    String getName () { return name; }

    void showDim () {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    double area() {
        System.out.println("Данный метод должен быть переопределён");
        return 0;
    }

}

class Triangle extends TwoDShape{

    private String style;

    Triangle(){
        super();
        style = "none";
    }

    Triangle(String s, double w, double h){
        super(w, h, "треугольник");
        style = s;
    }

    Triangle(String s, double x){
        super(x, "треугольник");
        style = s;
    }

    Triangle (Triangle obj){
        super(obj);
        style = obj.style;
    }


    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}


class Rectangle extends TwoDShape{

    Rectangle() { super(); }

    Rectangle(double w, double h) {
        super(w, h, "прямоугольник");
    }

    Rectangle(double x){
        super(x, "прямоугольник (квадрат)");
    }

    Rectangle(Rectangle obj){ super(obj); }

    boolean isSquare(){
        return getHeight() == getWidth();
    }


    double area() {
        return getHeight() * getWidth();
    }
}


public class DynMethodDemo {
    public static void main(String args[]){

        TwoDShape shapes [] = new TwoDShape[5];
        shapes[0] = new Triangle("контурный", 8, 12);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle("закрашенный" ,7.0);
        shapes[4] = new TwoDShape(10, 20, "фигура");

        for (TwoDShape shape : shapes) {
            System.out.println("Объект - " + shape.getName());
            System.out.println("Площадь - " + shape.area());
            System.out.println();
        }

    }
}