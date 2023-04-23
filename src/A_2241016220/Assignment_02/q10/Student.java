package A_2241016220.Assignment_02.q10;

public class Student extends Test {
    String name;
    int roll;

    void input(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    void output(){
        System.out.println("Roll: "+roll+", Name: "+name);
    }
}
