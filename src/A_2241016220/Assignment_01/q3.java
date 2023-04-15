package A_2241016220.Assignment_01;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int w = sc.nextInt();
        int sum=0,pro=1;
        while(w>0){
            pro *= w%10;
            sum += w%10;
            w/=10;
        }
        if(sum==pro) System.out.println("Spy Number");
        else System.out.println("Not a Spy Number");
    }
}
