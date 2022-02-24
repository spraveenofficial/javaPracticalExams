public class ThisDemo{
    int i, j;
    ThisDemo(){
        this(100);
    }
    ThisDemo(int a){
        this(a, 200);
    }
    ThisDemo(int i, int j){
        this.i = i;
        this.j = j;
    }
    void display(){
        System.out.println("Value of i" + i);
        System.out.println("Value of j" + j);
    }
    public static void main(String args[]){
        ThisDemo a1 = new ThisDemo();
        a1.display();
    }
}