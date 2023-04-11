package circularLinkedList;

public class l1 {
   node head;
    class node{
        String data;
        node next;

        node(String data){
            this.data=data;
        }
    }

    public void add(String data){
        node newNode = new node(data);
        newNode.next=head;
        head=newNode;
        
    }
    public static void main(String[] args) {
        l1 list = new l1();
    }
}
