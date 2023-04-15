package Recursion;

public class q2 {

    public static boolean isPrime(int n,int i){
        if (n<=2) return n==2;
        else if (i>n/2) return true;
        else if(n%i==0) return false;
        else return isPrime(n,i+1);
    }
    public static void main(String[] args) {
        System.out.println( isPrime(3,2));
    }
}
