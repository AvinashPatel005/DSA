package A_2241016220.Assignment_01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class hq2 {
    public static void main(String[] args){
        System.out.print("Enter number of lines:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        scanner.nextLine();
        for(int i=0;i<s.length;i++){
            s[i]=scanner.nextLine();
        }
        for (int i =s.length-1 ;i>=0;i--){
            System.out.println(s[i]);
        }
    }
}
