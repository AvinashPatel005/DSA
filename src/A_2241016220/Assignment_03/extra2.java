package A_2241016220.Assignment_03;
interface EmpInterface{
    void displayEmp();
    void giveBonus(double amount);
}
abstract class Employee{
    Employee(int e,String f,String n,double s){
        empId = e;
        fName = f;
        lName = n;
        salary =s;
    }
    int empId;
    String fName,lName;
    double salary;
}
class Manager extends Employee implements EmpInterface{
    double bonus;
    Manager(int e,String f,String n,double s,int b){
        super(e,f,n,s);
        bonus=b;
    }
    public void giveBonus(double amount) {
        bonus+=amount;
    }
    public void displayEmp() {
        System.out.println("ID: " +this.empId+", first name: "+this.fName+", Last name:"+this.lName+", salary: "+this.salary+ ", and final bonus: "+this.bonus);
    }

}
public class extra2 {
    public static void main(String[] args) {
        EmpInterface[] arr = new EmpInterface[10];
        arr[0]=new Manager(1,"xyz","abc",100,2);
        arr[0].giveBonus(10);
        arr[0].displayEmp();

    }
}
