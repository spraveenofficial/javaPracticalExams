import java.util.*;
import java.io.*;
import java.lang.*;

public class VectorDemo {
    public static void print(String data) {
        System.out.println(data);
    }

    public static void main(String args[]) {
        Vector v = new Vector();
        int length = args.length;
        for (int i = 0; i < length; i++) {
            v.addElement(args[i]);
        }
        print("Vector elems before sort");
        for (int i = 0; i < length; i++) {
            print("" + v.get(i));
        }
        Collections.sort(v);
        print("Vector elems after sort");
        for (int i = 0; i < length; i++) {
            print("" + v.get(i));
        }
    }
}
