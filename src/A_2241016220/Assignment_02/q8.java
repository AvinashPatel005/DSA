package A_2241016220.Assignment_02;

interface DetailInfo {
    void display();
    void count();
}
class Person1 implements DetailInfo{
    static int max_count;
    String name;
    Person1(String s){
        name =s;
    }
    public void display(){
        System.out.println(name+" "+max_count);
    }
    public void count(){
        max_count=name.length();
    }
}
class test{
    public static void main(String[] args) {
        DetailInfo p1 = new Person1("Avinash");
        p1.count();
        p1.display();

        DetailInfo p2 = new Person1("Souvik");
        p2.count();
        p2.display();
    }
}