abstract class Shape {
    abstract void area();

    double b;
}

class Traingle extends Shape {
    double b = 50, h = 20;

    void area() {
        System.out.println("Area of traingle = " + (b * h) / 2);
    }
}

class Rectangle extends Shape {
    double w = 70, h = 30;

    void area() {
        System.out.println("Area of Rectangle = " + w * h);
    }
}

class Circle extends Shape {
    double r = 10;

    void area() {
        System.out.println("Area of Circle = " + (Math.PI * r * r));
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Traingle t = new Traingle();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        t.area();
        r.area();
        c.area();
    }
}