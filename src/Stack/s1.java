package Stack;
//Stack using ArrayList
import java.util.ArrayList;


public class s1{
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isEmpty()) return -1;
            int n = list.get(list.size()-1);
            list.remove(list.size()-1);
            return n;
        }
        public int peek(){
            if(isEmpty()) return -1;
            return list.get(list.size()-1);
        }
        public void pushBottom(int data){
            if(isEmpty()){
                push(data);
                return;
            }
            int top = pop();
            pushBottom(data);
            push(top);
        }
        public void reverse(){
            if(isEmpty()){
                return;
            }
            int top = pop();
            reverse();
            pushBottom(top);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pushBottom(0);
        s.reverse();
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}