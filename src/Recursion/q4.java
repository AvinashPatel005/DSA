package Recursion;

public class q4 {
    public static int fibonacci(int fn, int sn, int n, int i){
        if(n<=1) return n;
        else if(i==n) return sn;
        else return fibonacci(sn ,fn+sn ,n,i+1);
    }
    public static void main(String[] args) {
        for(int i =1;i<=10;i++){
            System.out.print(fibonacci(0,1,i-1,0)+" ");
        }
    }
}
