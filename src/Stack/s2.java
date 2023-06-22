package Stack;
//Stack using LinkedList
public class s2 {
    static class Stack{
        Node head;
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
        }
        public boolean isEmpty(){
            return head==null;
        }
        public void push(int data) {
            Node node=new Node(data);
            if(isEmpty()){
                head=node;
                return;
            }
            node.next=head;
            head=node;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int n=head.data;
            head=head.next;
            return n;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        public void pushBottom(int data){
            if(isEmpty()) {
                push(data);
                return;
            }
            int top = pop();
            pushBottom(data);
            push(top);
        }
        public void reverse(){
            if(isEmpty()) return;
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
