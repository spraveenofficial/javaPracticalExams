import java.util.*;
import java.io.*;

public class Files {
    public static void main(String args[]) throws IOException {
        FileInputStream n1 = new FileInputStream("file1.txt");
        FileInputStream n2 = new FileInputStream("file2.txt");
        SequenceInputStream s = new SequenceInputStream(n1, n2);
        int c;
        while((c =s.read()) != -1){
            char ch = ((char) c);
            System.out.println(ch);
        }
        n1.close();
        n2.close();
        s.close();
    }
}