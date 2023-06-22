package LinkedList;
//from scratch
class linkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node p = head;
        while(p.next!=null){
            p=p.next;
        }
        p.next=newNode;
    }

    public void insertAt(int data,int n){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        if(n==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node p = head;
        for(int i=0;i<n-1&&p.next!=null;i++){
            p=p.next;
        }
        newNode.next=p.next;
        p.next=newNode;
    }

    public void deleteFirst(){
       if(head==null){
           System.out.println("List is Empty!");
           return;
       }
       head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node p = head;
        while(p.next.next!=null){
            p=p.next;
        }
        p.next=null;
    }

    public void deleteAt(int n){
        if(head==null){
            System.out.println("List is Empty");
        }
        if(n==0){
            head=head.next;
            return;
        }
        Node p=head;
        for(int i=0;i<n-1&&p!=null;i++){
            p=p.next;
        }
        if(p!=null&&p.next!=null){
            p.next=p.next.next;
        }
        else System.out.println("Position not Found");
    }

    public void reverse(){
        Node curr=head.next;
        Node prev=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
    }
    public void display(){
        Node p=head;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.insertFirst(2);
        l1.insertFirst(1);
        l1.insertLast(3);
        l1.insertAt(0,0);
        l1.insertAt(4,13);
        l1.insertLast(3);
        l1.insertFirst(1);
        l1.display();
        l1.deleteFirst();
        l1.display();
        l1.deleteLast();
        l1.display();
        l1.deleteAt(5);
        l1.display();
        l1.reverse();
        l1.display();

    }
}
