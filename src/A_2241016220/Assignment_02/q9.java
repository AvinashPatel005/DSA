package A_2241016220.Assignment_02;

import java.util.Scanner;

class Student1 {
    int roll;
    String name,course;

    void input_Student(int r,String n,String c){
        roll=r;
        name=n;
        course=c;
    }
    void display_Student(){
        System.out.print("Roll: "+roll+", Name: "+name+", Course: "+course);
    }

}
class Exam extends Student1{
    int mark1,mark2,mark3;
    void input_Marks(int r,String n,String c,int m1,int m2,int m3){
        input_Student(r,n,c);
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    void display_Result(){
        System.out.println("Total Marks: "+(mark1+mark2+mark3));
    }

    public static void main(String[] args) {
        Exam[] arr= new Exam[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Student Detail (Roll,Name,Branch,Mark1.Mark2,Mark3): ");
            arr[i]= new Exam();
            int r = sc.nextInt();
            String n = sc.next();
            String c = sc.next();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            arr[i].input_Marks(r,n,c,m1,m2,m3);
        }
        for(Exam ob : arr){
            ob.display_Student();
            ob.display_Result();
        }
    }
}

