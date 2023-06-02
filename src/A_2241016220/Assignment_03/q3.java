package A_2241016220.Assignment_03;

import java.util.Scanner;

class MarksOutOfBoundsException extends Exception{
    public MarksOutOfBoundsException(String str){
        super(str);
    }
}
class Student {
    String name;
    int roll;
    Student(String s,int n) throws Exception{
        name=s;
        if(n<=100) {
            roll=n;
            System.out.println("Data Entered");
        }
        else throw new MarksOutOfBoundsException("Marks cannot be grater than 100");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Student:");
        String name = sc.next();
        System.out.println("Enter marks");
        int marks = sc.nextInt();
        try {
            Student s = new Student(name,marks);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
