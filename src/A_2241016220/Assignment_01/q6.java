package A_2241016220.Assignment_01;

import java.util.Scanner;

public class q6 {
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to check for odd or even :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isOdd(n)) System.out.println("Odd");
        else System.out.println("Even");

    }
}
