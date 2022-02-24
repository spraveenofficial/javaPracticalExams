import java.util.Vector;

public class VectorDemo {
    public static void print(String data){
        System.out.println(data);
    }
    public static void main(String args[]){
        Vector<String> v = new Vector <String> ();
        v.add("Java");     
        v.add("C");     
        v.add("C++");     
        v.add("JavaScript");     
        print("Initial Vector value" + v.toString());
        print("The last value of vector" + v.lastElement());
        print("The 2nd value of vector" + v.elementAt(2));
        v.insertElementAt("Python", 2);
        v.insertElementAt("React", 1);
        print("After adding elements" + v.toString());
        v.removeElementAt(2);
        print("After Removal elem at 2" + v.toString());
        v.setElementAt("VB", 1);
        print("Vector after all operations "+ v.toString());
    }
}
