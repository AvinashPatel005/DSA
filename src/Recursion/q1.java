package Recursion;
//decimal to binary
public class q1 {
    public static int binary(int n){
        if(n<2) return n;
        else return  n%2+10*binary(n/2);
    }
    public static void main(String[] args) {
        System.out.println(binary(37));;
    }
}
