package Queue;
//Circular Queue Array Implementation
public class Q2 {
    static class Queue{
        int size;
        int front;
        int rear;
        int[] arr;
        Queue(int size){
            this.size=size;
            this.front=-1;
            this.rear=1;
            arr=new int[size];
        }
        public void insert(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
        }
        public int delete(){
            return -1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }
        public boolean isEmpty(){
            return rear==front;
        }

    }
}
