package Queue;
//Array implementation
public class Q1{
    static class Queue{
        private final int size;
        int rear;
        int[] arr;
        Queue(int size){
            this.size=size;
            arr=new int[size];
            rear=-1;
        }
        public void insert(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            arr[++rear]=data;
        }
        //deletion requires O(n)
        public int delete(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int n = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            arr[rear--]=0;
            return n;
        }
        public void reverse(){
            if(isEmpty()) {
                return;
            }
            int front = delete();
            reverse();
            insert(front);
        }
        public boolean isFull(){
            return rear+1==size;
        }
        public boolean isEmpty(){
            return rear==-1;
        }
        public void display(){
            for (int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(4);
        q1.insert(10);
        q1.insert(20);
        q1.insert(30);
        q1.insert(40);
        q1.display();
        q1.delete();
        q1.display();
        q1.reverse();
        q1.display();

    }
}
