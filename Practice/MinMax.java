import java.util.*;

public class MinMax {
    public static void main(String args[]) {
        int[] arr = new int[5];
        int[] y = new int[arr.length];
        Scanner s = new Scanner(System.in);
        System.out.println("ENter the values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Entered value");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            y[i] = arr[i];
        }
        System.out.println("After copying");
        for (int b : y) {
            System.out.println(b);
        }
        int min = arr[0], max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("MIn = " + min);
        System.out.println("Max = " + max);
    }
}