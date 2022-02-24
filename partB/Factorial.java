public class Factorial {
    public static void main(String args[]){
        int [] arr = new int [10];
        int fact;
        if(args.length == 0){
            System.out.println("No Argument Found");
            return;
        }
        for(int i=0; i< args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i=0; i< args.length; i++){
            fact = 1;
            while(arr[i] > 0){
                fact = fact * arr[i];
                arr[i]--;
            }
            System.out.println("Factorial = " + fact);
        }
    }
}

// Prem / Kailash - Betabar, Dhadhani =