// public class Wrapper {
//     public static void main(String args[]){
//         int i = 100;
//         Integer i1 = Integer.valueOf(i);
//         Integer i2 = Integer.valueOf("200");
//         System.out.println("The primitive value of i1 " + i1.intValue());
//         System.out.println("The primitive value of i2 " + i2.intValue());
//         String str1 = "12334";
//         int i3 = Integer.parseInt(str1);
//         System.out.println("The value of i3" + i3);
//         System.out.println("The String value of i1 " + i1.toString());
//         System.out.println("The String value of i2 " + i2.toString());
//     }
// }



public class Wrapper{
    public static void main(String args[]){
        int i = 100;
        Integer i1 = Integer.valueOf(i);
        Integer i2 = Integer.valueOf("200");
        System.out.println("The primitive value of i1 = " + i1.intValue());
        System.out.println("The primitive value of i2 = " + i2.intValue());
        String str = "124324";
        Integer i3 = Integer.parseInt(str);
        System.out.println("The value of i3 = " + i3);
        System.out.println("The primitive value of i1 = " + i1.toString());
        System.out.println("The primitive value of i2 = " + i2.toString());
    }
}