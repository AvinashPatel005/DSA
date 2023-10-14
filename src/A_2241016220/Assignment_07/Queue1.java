package A_2241016220.Assignment_07;

import java.util.Scanner;

public class Queue1 {
    public final static int MAX=10;
    public static int front = -1;
    public static int rear= -1;
    public static void insert(int[] Q){
        if(rear+1==MAX){
            System.out.print("Queue Overflow! Insert not Possible");
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Element to insert:");
            int n= sc.nextInt();
            Q[++rear]=n;
        }

    }
    public static void delete(int[] Q){
        if(rear==-1){
            System.out.print("Queue Underflow! Delete not Possible");
        }
        else{
            System.out.println("deleted item "+Q[front]);
            if(front==rear){
                rear=-1;
                front=-1;
            }
            else{
                front++;
            }
        }

    }
    public static void main(String[] args) {


    }
}
