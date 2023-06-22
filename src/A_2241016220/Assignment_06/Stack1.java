package A_2241016220.Assignment_06;

import java.util.Scanner;

public class Stack1 {
    public static final int MAX=10;
    public static int push(int[] s,int top){
        if(isFull(top)){
            System.out.println("Stack is full");
            return top;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Element to Push:");
        int n = sc.nextInt();
        s[++top]=n;
        return top;
    }
    public static int pop(int[] s,int top){
        if(isEmpty(top)){
            System.out.println("Stack is Empty");
            return -1;
        }
        int r=s[top];
        s[top--]=0;
        return top;
    }
    public static int peek(int[] s,int top){
        if(isEmpty(top)) return -1;
        return s[top];
    }
    public static boolean isEmpty(int top){
        return top<0;
    }
    public static boolean isFull(int top){
        return top==MAX-1;
    }

    public static void display(int[] s,int top){
        if(isEmpty(top)){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(s[i]);
        }
    }
    public static void main(String[] args) {
        int[] s = new int[MAX];
        int top=-1;
        top = push(s,top);
        top = push(s,top);
        top = push(s,top);
        top = push(s,top);
        top = pop(s,top);
        display(s,top);
    }
}
