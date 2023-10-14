package A_2241016220.Assignment_07;

import java.util.Scanner;

class Node
{
    int info;
    Node next;
}
public class Queue2 {
    static Node rear = null;
    static Node front = null;
    public static void insert (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of new node: ");
        int data = sc.nextInt();
        Node n = new Node();
        n.info=data;
        n.next=null;
        if(rear==null){
            front=n;
            rear=n;
        }
        else{
            rear.next=n;
            rear=n;
        }
    }
    public static void delete (){
        if(front==null){
            System.out.println("Queue underflow, Delete not possible");
        }
        else{
            front=front.next;
            if(front==null) rear=null;
        }
    }
    public static void main(String[] args) {

    }
}
