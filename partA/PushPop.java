import java.util.*;

public class PushPop{
    public static void print(String data){
        System.out.println(data);
    }
    public static void main(String args[]){
        Stack <Integer> stk = new Stack<Integer>();
        print("Stack" + stk);
        pushElement(stk, 20);
        pushElement(stk, 13);
        pushElement(stk, 40);
        pushElement(stk, 60);
        pushElement(stk, 80);
        pushElement(stk, 90);
        pushElement(stk, 45);
        popElement(stk);
        popElement(stk);
        popElement(stk);
        try{
            popElement(stk);
        }catch(Exception e){
            print("Empty Stack");
        }
    }
    static void pushElement(Stack stk, int b){
        stk.push(new Integer(b));
        print("Push -> " + b);
        print("Stack" + stk);
    }
    static void popElement(Stack stk){
        Integer x = (Integer) stk.pop();
        print("Pop -> " + x);
        print("Stack" + stk);
    }
}