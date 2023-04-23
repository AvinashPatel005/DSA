package A_2241016220.Assignment_02;

class Phone {
    int area_code,exchange,number;
    public void input(int area_code,int exchange,int number){
        this.area_code=area_code;
        this.exchange=exchange;
        this.number=number;
    }
    public void display(){
        System.out.println("("+area_code+") "+exchange+"-"+number);
    }
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();

        p1.area_code=212;
        p1.exchange=767;
        p1.number=8900;

        p2.input(414,555,1212);

        System.out.print("My number is ");
        p1.display();
        System.out.print("Your number is ");
        p2.display();
    }
}
