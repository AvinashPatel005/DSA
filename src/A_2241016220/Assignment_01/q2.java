package A_2241016220.Assignment_01;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight (kg) : ");
        float w = sc.nextFloat();
        System.out.print("Enter height (m) : ");
        float h = sc.nextFloat();
        float bmi = w/(h*h);

        if(bmi<18.5) System.out.println("Underweight");
        else if(bmi<=24.9) System.out.println("Normal weight");
        else if(bmi<=29.9) System.out.println("Overweight");
        else System.out.println("Underweight");

    }
}
