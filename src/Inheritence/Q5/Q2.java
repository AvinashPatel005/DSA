package Inheritence.Q5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

abstract class Event{
    private String name,detail,type,ownerName;
    private double costPerDay;
    public Event(String name, String detail, String type, String ownerName, double costPerDay) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
        this.costPerDay = costPerDay;
    }
    public double getCostPerDay(){
        return costPerDay;
    }
    public abstract double calculateGST(long days);

}
class Exhibition extends Event {
    private int noOfStall;
    public Exhibition(String name, String detail, String type, String ownerName, double costPerDay, int noOfStall) {
        super(name, detail, type, ownerName, costPerDay);
        this.noOfStall = noOfStall;
    }
    public double calculateGST(long days) {
        return getCostPerDay()*days*0.05;
    }
}
class  StageEvent extends Event {
    private int noOfSeats;
    public StageEvent(String name, String detail, String type, String ownerName, double costPerDay, int noOfSeats) {
        super(name, detail, type, ownerName, costPerDay);
        this.noOfSeats = noOfSeats;
    }

    public double calculateGST(long days) {
        return getCostPerDay()*days*0.15;
    }
}
class Main3{
    public static void main(String[] args) {
        Event a;
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        sc.nextLine();
        String n = sc.nextLine();
        String d = sc.nextLine();
        String t = sc.nextLine();
        String o = sc.nextLine();
        double c = sc.nextDouble();
        int ns=sc.nextInt();
        sc.nextLine();
        String sd=sc.nextLine();
        String ed=sc.nextLine();
        LocalDate sDate= LocalDate.parse(sd,dtf);
        LocalDate eDate= LocalDate.parse(ed,dtf);
        long days = ChronoUnit.DAYS.between(sDate,eDate);
        if(opt==1){
            a=new Exhibition(n,d,t,o,c,ns);
            System.out.println(a.calculateGST(days));
        }
        else if(opt==2) {
            a=new StageEvent(n,d,t,o,c,ns);
            System.out.println(a.calculateGST(days));
        }
    }
}