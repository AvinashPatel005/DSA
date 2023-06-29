package A_2241016220.Assignment_06;

import java.util.Scanner;

public class Stack2 {

    static class Node{
        int data;
        Node next;
    }
    public static Node push(Node Top){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Element to Push:");
        int n = sc.nextInt();
        Node newNode = new Node();
        newNode.data=n;
        newNode.next=Top;
        Top=newNode;
        return Top;
    }
    public static Node pop(Node Top){
        if(Top==null){
            System.out.println("Stack underFLow.");
            return null;
        }
        Top=Top.next;
        return Top;
    }
    public static void display(Node top){
        if(top==null){
            System.out.println("Stack underFLow.");
            return;
        }
        Node p = top;
        while(p!=null){
            System.out.println(p.data);
            p=p.next;
        }
    }
    public static void main(String[] args) {
        Node top=null;
        top = push(top);
        top = push(top);
        top = push(top);
        top = push(top);
        top = pop(top);
        display(top);
    }
}
