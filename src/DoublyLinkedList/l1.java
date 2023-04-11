package DoublyLinkedList;

public class l1 {
    node head;
    class node{
        String data;
        node next;
        node prev;

        node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public void insertFirst(String data){
        node newNode = new node(data);
        if(head!=null) {
            head.prev=newNode;
            newNode.next=head;
        }
        head=newNode;
    }
    public void insertLast(String data){
        node newNode = new node(data);
        node curr = head;
        if(head==null) head = newNode;
        else{
            while(curr.next!=null){
                curr=curr.next;
            }
            newNode.prev=curr;
            curr.next=newNode;
        }
    }

    public void insertAfter(node prev_Node, String data){
        if(prev_Node==null){
            System.out.println("the Previous node should not be null");
            return;
        }
        node newNode = new node(data);
        if(prev_Node.next!=null){
            newNode.next = prev_Node.next;
            prev_Node.next.prev=newNode;
        }
        newNode.prev= prev_Node;
        prev_Node.next=newNode;
    }

    public void insertBefore(node next_Node, String data){
        if(next_Node==null){
            System.out.println("the Next node should not be null");
            return;
        }
        if(next_Node.prev==null){
            insertFirst(data);
            return;
        }
        node newNode = new node(data);
        newNode.prev = next_Node.prev;
        next_Node.prev.next = newNode;
        next_Node.prev=newNode;
        newNode.next=next_Node;
    }

    public void delete(node delete){
        if(head==null||delete==null) return;
        if(delete==head){
           head=head.next;
           head.prev=null;
           return;
        }
        if(delete.next!=null){
            delete.prev.next=delete.next;
            delete.next.prev=delete.prev;
        }
        else{
            delete.prev.next=null;
        }

    }
    public node getNode(String data){
        node curr = head;
        while(curr!=null&&!curr.data.equals(data)){
            curr=curr.next;
        }
        return curr;
    }

    public void print(){
        node n = head;
        node l = null;
        System.out.println("Forward Transversal");
        while(n!=null){
            System.out.print(n.data+"->");
            l=n;
            n=n.next;
        }
        System.out.println("NULL");
        System.out.println("Backward Transversal");
        while(l!=null){
            System.out.print(l.data+"->");
            l=l.prev;
        }
        System.out.println("NULL");
        System.out.println("---------------------");
    }
    public static void main(String[] args) {
        l1 list = new l1();
        list.insertFirst("is");
        list.insertFirst("name");
        list.insertFirst("my");
      //  list.print();
        list.insertLast("Avinash");
       // list.print();
        list.insertAfter(list.head.next, "not" );
       // list.print();
        list.insertBefore(list.head.next,"also" );
        list.print();
        list.delete(list.head.next.next.next.next.next);
        list.print();
    }
}
