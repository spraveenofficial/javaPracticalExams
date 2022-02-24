import java.util.*;

public class MinMax {
    public static void main(String args[]) {
        int[] x = new int[5];
        int[] y = new int[x.length];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
        for (int i = 0; i < x.length; i++) {
            x[i] = s.nextInt();
        }
        System.out.println("Entered Elems");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            y[i] = x[i];
        }
        System.out.println("After copying elems");
        for (int b : y) {
            System.out.println("" + b);
        }
        int min = x[0], max = 1;
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
            if (x[i] > max) {
                max = x[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}