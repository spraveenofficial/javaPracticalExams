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
        this.j=j;
    }
    void display(){
        System.out.println("I" + i);
        System.out.println("J" + j);
    }
    public static void main(String args[]){
        ThisDemo a2 = new ThisDemo();
        a2.display();
    }
}