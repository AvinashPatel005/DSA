package A_2241016220.Assignment_03;
class Box<T1,T2>
{
    T1 t1;
    T2 t2;
    public Box(T1 t1,T2 t2)
    {
        this.t1 = t1;
        this.t2 = t2;
    }
    public T1 getValue1()
    {
        return t1;
    }
    public T2 getValue2()
    {
        return t2;
    }
    public String returnString(Box<T1,T2> B)
    {
        return B.t1.toString();
    }
}
class Q6 {
    public static void main(String[] args) {
        Box<String,String> S1 = new Box<String,String>("Hello","Java");
        System.out.println(S1.getValue1());
        System.out.println(S1.getValue2());
        Box<Integer,Integer> S2 = new Box<Integer,Integer>(100,200);
        System.out.println(S2.getValue1());
        System.out.println(S2.getValue2());
        Box<Object,Object> S3 = new Box<Object,Object>(S1,S2);
        System.out.println(S3.getValue1());
        System.out.println(S3.getValue2());
        //System.out.println(S3.returnString(S2));
    }
}