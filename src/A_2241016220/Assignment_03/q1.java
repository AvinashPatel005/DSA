package A_2241016220.Assignment_03;

import java.security.spec.ECField;
import java.util.Scanner;

public class q1 {
    public static void lucky() throws Exception{
        System.out.println("Enter your Lucky number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0) throw  new NumberFormatException("Negative number");
        else System.out.println(n);
    }
    public static void main(String[] args) {
        try{
            lucky();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
