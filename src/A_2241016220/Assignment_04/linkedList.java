package A_2241016220.Assignment_04;

import java.util.Scanner;

class Node{
    protected int regd_no;
    protected float mark;
    protected Node next;
}
public class linkedList {
    public static Node inputNode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration number of new node: ");
        int regd_no = sc.nextInt();
        System.out.println("Enter the roll number of node: ");
        float mark = sc.nextFloat();
        Node node = new Node();
        node.regd_no = regd_no;
        node.mark = mark;
        return node;
    }
    public static Node create(Node start){
        if(start==null){
            Scanner sc = new Scanner(System.in);
            Node tail = null;
            char ch;
            do{
                Node node = inputNode();
                System.out.println("Do you want to create another node: ");
                ch = sc.next().charAt(0);
                if(start==null){
                    start=node;
                }
                else{
                    tail.next=node;
                }
                tail=node;
            }
            while (ch=='y'||ch=='Y');
        }
        else{
            System.out.println("List already created!");
        }
        return start;
    }
    public static Node InsBeg(Node start){
        Node node = inputNode();
        if(start==null){
            start=node;
        }
        else{
            node.next=start;
            start=node;
        }
        return start;
    }
    public static Node InsEnd(Node start){
        Node node = inputNode();
        if(start==null){
            start=node;
        }
        else{
            Node p = start;
            while(p.next!=null){
                p=p.next;
            }
            p.next=node;
        }
        return start;
    }
    public static Node InsAny(Node start){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position :");
        int pos = sc.nextInt();
        if(pos==0||start==null){
           start = InsBeg(start);
        }
        else{
            int c=0;
            Node p = start;
            while(c<pos-1&&p.next!=null){
                p=p.next;
                c++;
            }
            Node node = inputNode();
            if(p.next!=null) node.next=p.next;
            p.next=node;
        }
        return start;
    }
    public static Node DelBeg(Node start){
        if(start==null) System.out.println("List is already empty");
        else{
            start=start.next;
        }
        return start;
    }
    public static Node DelEnd(Node start){
        if(start==null) System.out.println("List is already empty");
        else if(start.next==null) start=null;
        else{
            Node p = start;
            while(p.next.next!=null){
                p=p.next;
            }
            p.next=null;
        }
        return start;
    }
    public static Node DelAny(Node start){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position :");
        int pos = sc.nextInt();
        if(start==null) System.out.println("List is already empty");
        else if(pos==0){
            start=start.next;
        }
        else{
            int c=0;
            Node p = start;
            while(c<pos-1&&p!=null){
                p=p.next;
                c++;
            }
            if(p!=null&&p.next!=null) p.next=p.next.next;
        }
        return start;
    }
    public static int size(Node start){
        int size=0;
        Node p = start;
        while(p!=null){
            p=p.next;
            size++;
        }
        return size;
    }
    public static void display(Node start){
        System.out.println("Regd.no \t Marks");
        Node p = start;
        while(p!=null){
            System.out.println(p.regd_no+" \t\t "+p.mark);
            p=p.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null;
        System.out.println("Program for creating single linkedlist");
        while(true)
        {
            System.out.println("Manu for different operation");
            System.out.println("Press 0: Exit");
            System.out.println("Press 1: Create Linked-list");
            System.out.println("Press 2: Display Linked-list");
            System.out.println("Press 3: Add node at beginning");
            System.out.println("Press 4: Add node at end");
            System.out.println("Press 5: Add node at a position");
            System.out.println("Press 6: Delete node at beginning");
            System.out.println("Press 7: Delete node at end");
            System.out.println("Press 8: Delete node at a position");
            System.out.println("Press 9: Display size of Linked-List");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> start = create(start);
                case 2 -> display(start);
                case 3 -> start = InsBeg(start);
                case 4 -> start = InsEnd(start);
                case 5 -> start = InsAny(start);
                case 6 -> start = DelBeg(start);
                case 7 -> start = DelEnd(start);
                case 8 -> start = DelAny(start);
                case 9 -> System.out.println("Size of Linked-List is " + size(start));
                default -> System.out.println("Wrong choice: try again");
            }
        }
    }
}
