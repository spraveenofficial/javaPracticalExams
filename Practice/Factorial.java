public class Factorial{
    public static void print(String data){
        System.out.println(data);
    }
    public static void main(String args[]){
        int [] arr = new int[100];
        int fact;
        if(args.length == 0){
            print("No Argument Found");
            return;
        }
        for(int i=0; i<args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i=0; i<args.length; i++){
            fact =1;
            while(arr[i] > 0){
                fact = fact * arr[i];
                arr[i] --;
            }
            print("Factorial = " + fact);
        }
    }
}