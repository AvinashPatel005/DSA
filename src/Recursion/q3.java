package Recursion;

public class q3 {
    public static int digit_Sum(int n){
        if(n<10) return n;
        else return n%10+digit_Sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(digit_Sum(12));;
    }
}
