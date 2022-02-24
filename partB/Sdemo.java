public class Sdemo {
    int i;
    static int j;

    static void function1() {
        System.out.println(j);
        j = j + 1;
        Sdemo s1 = new Sdemo();
        s1.i = 15;
        System.out.println(s1.i);
    }

    public static void main(String args[]) {
        function1();
        function1();
        Sdemo s1 = new Sdemo();
        s1.i = 150;
        System.out.println(s1.i);
    }
}
