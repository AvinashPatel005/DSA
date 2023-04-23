package A_2241016220.Assignment_02;

import java.util.Scanner;
class Student {
    int Roll;
    String Name;
    int DSA_MARKS;
    void setData(int Roll, String Name, int DSA_MARKS){
        this.Roll = Roll;
        this.Name = Name;
        this.DSA_MARKS = DSA_MARKS;
    }
    void display(){
        System.out.println("Roll no:"+Roll+", Name:"+Name+", DSA_Marks:"+DSA_MARKS);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[5];

        for (int i=0;i<arr.length;i++){
            System.out.print("Enter Student "+(i+1)+" Details (Roll, Name, DSA Marks): ");
            arr[i] = new Student();
            int r = sc.nextInt();
            String n = sc.next();
            int m = sc.nextInt();
            arr[i].setData(r,n,m);
        }
        System.out.println("List:");
        for(Student student : arr){
            student.display();
        }
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i].DSA_MARKS>max){
                max=arr[i].DSA_MARKS;
                maxIndex=i;
            }

        }
        System.out.print("Highest Marks Obtained by : ");
        arr[maxIndex].display();
    }
}

