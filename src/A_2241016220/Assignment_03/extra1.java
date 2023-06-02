package A_2241016220.Assignment_03;
//swap two generic var
class generic<T1,T2> {
    T1 t1;
    T2 t2;
    public generic(T1 t1,T2 t2){
        this.t1=t1;
        this.t2=t2;
    }
    void display(){
        System.out.println(t1+" "+t2);
    }
    void swap(){
        T1 temp = t1;
        t1=(T1)t2;
        t2=(T2)temp;
    }

    public static void main(String[] args) {
        generic<Integer,Integer> o1 =new generic<Integer, Integer>(10,20);
        o1.display();
        o1.swap();
        o1.display();

        generic<String,Integer> o2 =new generic<String, Integer>("Hi",20);
        o2.display();
        o2.swap();
        o2.display();
    }
}
