package linkedList;
//from scratch
public class l1 {
    node head;
    int size;

    l1(){
        this.size=0;
    }
    class node{
        String data;
        node next;

        node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
        node n = new node(data);
        if(head==null){
           head=n;
        }
        else {
            n.next=head;
            head=n;
        }
    }
    public void addLast(String data){
        node n = new node(data);
        node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }

    public void deleteFirst(){
        size--;
       if(head!=null){
          head = head.next;
       }
    }
    public void deleteLast(){
        size--;
        node ln=head.next;
        node sln=head;
        while(ln.next!=null){
            ln=ln.next;
            sln=sln.next;
        }
        sln.next=null;

    }

    public void reverseIterative() {
        node curr = head.next;
        node prev = head;
        while (curr != null) {
            node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    public void insertAt(String data , int pos){
        size++;
        if(pos==1) {
            addFirst(data);
            return;
        }

        node ele = new node(data);
        node n = head;
        int count=0;
        while(count<pos-2){
            n=n.next;
            count++;
        }
        node temp = n.next;
        n.next=ele;
        ele.next=temp;

    }

    public void deleteAt(int pos){
        //node curr = head.next;
        node prev = head;
        int count=0;
        while(count<pos-2){
            prev=prev.next;
            count++;
        }
        prev.next=prev.next.next;
    }

    public void print(){
        node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void getSize(){
        System.out.println(size);
    }

    public static void main(String[] args) {
        l1 list = new l1();
        list.addFirst("is");
        list.addFirst("Name");
        list.addFirst("My");
        list.addLast("Avinash");
        list.print();
        list.getSize();
        list.insertAt("a",5);
        list.deleteAt(4);
//        list.reverseIterative();
        list.print();
//        list.deleteLast();
//        list.deleteFirst();
//        list.print();
//        list.getSize();
    }
}
