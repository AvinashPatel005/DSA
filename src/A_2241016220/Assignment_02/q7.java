package A_2241016220.Assignment_02;

class Person {
    String name;
    int age;
    Person(String n,int a){
        name=n;
        age=a;
    }
}
class Employee extends Person{
    int Eid;
    double salary;
    Employee(String s,int a,int e,double sa){
        super(s,a);
        Eid=e;
        salary=sa;
    }
    void empDisplay(){
        System.out.println(name+" "+age+" "+Eid+" "+salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Avinash",18,101,10);
        e1.empDisplay();
    }
}
