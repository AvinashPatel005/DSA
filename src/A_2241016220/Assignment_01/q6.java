package A_2241016220.Assignment_01;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check for odd or even :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&1)==0) System.out.println("EVEN");
        else System.out.println("ODD");

    }
}
