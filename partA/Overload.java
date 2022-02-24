class OverLoadDemo {
    void area(double b, double h) {
        System.out.println("Area = " + 0.5 * b * h);
    }

    void area(int l, int b) {
        System.out.println("Area = " + l * b);
    }

    void area(double r) {
        System.out.println("Area = " + (3.14 * r * r));
    }
}

public class Overload {
    public static void main(String args[]) {
        OverLoadDemo n1 = new OverLoadDemo();
        n1.area(10);
        // Call more here
    }
}