public class WrapperObject {
    public static void print(String data) {
        System.out.println(data);
    }

    public static void main(String args[]){
        int i = 100;
        Integer a1 = Integer.valueOf(i);
        Integer a2 = Integer.valueOf("200");
        print("Initial value of a1 = "+ a1);
        print("Initial value of a2 = "+ a2);
        String str = "123234";
        Integer num1 = Integer.parseInt(str);
        print("Value of str = " + num1);
        print("The string value of a1 = " + a1.toString());
        print("The string value of a2 = " + a2.toString());
    }
}
