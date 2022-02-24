public class Sdemo{
    int i;
    static int j;
    static void function1(){
        System.out.println(j);
        j = j+ 1;
        Sdemo a2 = new Sdemo();
        a2.i = 15;
        System.out.println(a2.i);
    }
    public static void main(String args[]){
        function1();
        function1();
        Sdemo a1 = new Sdemo();
        a1.i = 150;
        System.out.println(a1.i);
    }
}