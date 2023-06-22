package Stack;

import java.util.Stack;

//using collection frameworks
public class s3 {
    public static void pushBottom(int data,Stack<Integer> stack){
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushBottom(data,stack);
        stack.push(top);
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()) return;
        int top = stack.pop();
        reverse(stack);
        pushBottom(top,stack);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        pushBottom(0,s);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
