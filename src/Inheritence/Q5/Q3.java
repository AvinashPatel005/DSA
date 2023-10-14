package Inheritence.Q5;
import java.util.Scanner;

class Date{
    int year,month,date;

    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }
}
abstract class Account{
    String name;
    int number,balance;
    Date startDate;
    abstract double calculateInterest(Date duedate);
}
class CurrentAccount extends Account{
    public CurrentAccount(String name, int number, int balance, Date startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }
    double calculateInterest(Date duedate) {
        double time = Math.abs(duedate.year-startDate.year);
        System.out.println(time);
        return 0.05*time*balance;
    }
}
class SavingsAccount extends Account{
    public SavingsAccount(String name, int number, int balance, Date startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }
    double calculateInterest(Date duedate) {
        double time = Math.abs(duedate.year-startDate.year);
        return 0.12*time*balance;
    }
}
class Main1{
    public static Date conv(String date){
        String arr[] = date.split("/");
        return new Date(Integer.parseInt(arr[2]),Integer.parseInt(arr[1]),Integer.parseInt(arr[0]));
    }
    public static void main(String[] args) {
        Account a;
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        sc.nextLine();
        String n = sc.nextLine();
        int ac = sc.nextInt();
        int bal=sc.nextInt();
        sc.nextLine();
        String sd=sc.nextLine();
        String dd=sc.nextLine();
        Date sDate = conv(sd);
        Date dDate = conv(dd);

        if(opt==1){
            a=new SavingsAccount(n,ac,bal,sDate);
            System.out.println(a.calculateInterest(dDate));
        }
        else if(opt==2){
            a=new CurrentAccount(n,ac,bal,sDate);
            System.out.println(a.calculateInterest(dDate));
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
