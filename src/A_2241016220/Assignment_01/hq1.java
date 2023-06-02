package A_2241016220.Assignment_01;

import java.util.Scanner;

public class hq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b==c) System.out.println("a+b=c => "+a+"+"+b+"="+c);
        else if(a==b-c) System.out.println("a=b-c => "+a+"="+b+"-"+c);
        else if(a*b==c) System.out.println("a*b=c => "+a+"*"+b+"="+c);
        else System.out.println("Cannot be written in correct arithmetic formula");
    }
}
