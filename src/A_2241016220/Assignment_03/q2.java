package A_2241016220.Assignment_03;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class q2 {
    static String[] arr=new String[4];
    public static void input(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        sc.close();
    }
    public static void color_to_int(){
        Integer.parseInt(arr[0]);
    }
    public static void input_more(String s){
        arr[5]=s;
    }
    public static void main(String[] args) {
        input();
        try{
            color_to_int();
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter one more Color: ");
            String s = sc.next();
            input_more(s);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
