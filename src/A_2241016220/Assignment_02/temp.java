package A_2241016220.Assignment_02;

import java.util.Scanner;

public class temp {
    private int roll;
    private String name;
    private int marks;

    public temp(int r,String n,int m){
        this.roll=r;
        this.name=n;
        this.marks=m;
    }
    public temp(int r,String n){
        roll = r;
        name = n;
    }
    public temp(String n){
        name = n;
    }
    public void display(){
        System.out.println(roll+" "+marks+" "+name);

    }
    public static void main(String[] args) {
     temp s1 =new temp(2 , "AVinash",88);
     temp s2=new temp(2,"Souvik");
        temp s3=new temp("Sou");
    s1.display();
    s2.display();
    s3.display();

    s3.roll = 10;
    s3.display();
    }
}

