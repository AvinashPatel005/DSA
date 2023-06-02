package A_2241016220.Assignment_02;

import java.util.Scanner;

class Commission {
    double sales;
    Commission(double s){
        sales=s;
    }
    double getCommission(){
        double com;
        if(sales<100) com=0.02*sales;
        else if(sales<5000) com=0.05*sales;
        else com=0.08*sales;
        return com;
    }
}
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales: ");
        double sales = sc.nextDouble();
        if(sales<0) System.out.println("Invalid Input");
        else{
            Commission c = new Commission(sales);
            System.out.println("Commission is:"+c.getCommission());;
        }
    }
}
