import java.util.*;
import java.io.*;
import java.lang.*;

public class VectorDemo {
    public static void print(String data) {
        System.out.println(data);
    }

    public static void main(String args[]) {
        Vector list = new Vector();
        int length = args.length;
        for (int i = 0; i < length; i++) {
            list.addElement(args[i]);
        }
        print("Vector Element before Soring");
        for (int i = 0; i < list.size(); i++) {
            print("" + list.get(i));
        }
        print("Vector Elements after Sorting");
        for (int i = 0; i < list.size(); i++) {
            print("" + list.get(i));
        }
    }
}
