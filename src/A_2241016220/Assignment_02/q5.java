package A_2241016220.Assignment_02;

class Deposit {
    long Principle;
    int Time;
    double rate,Total_amt;

    public Deposit(){
    }
    public Deposit(long Principle, int Time, double rate){
        this.Principle=Principle;
        this.Time=Time;
        this.rate=rate;
    }
    public Deposit(long Principle, int Time){
        this.Principle=Principle;
        this.Time=Time;
    }
    public Deposit(long Principle, double rate){
        this.Principle=Principle;
        this.rate=rate;
    }

    public void display(){
        System.out.println("Principle:"+Principle+", Time:"+Time+", Rate:"+ rate+", TotalAmount:"+Total_amt);
    }
    public void calc_amt(){
        Total_amt=Principle+(Principle*rate*Time)/100;
    }

    public static void main(String[] args) {
        Deposit d1 = new Deposit(100,1,2);
        d1.calc_amt();
        d1.display();
    }
}
