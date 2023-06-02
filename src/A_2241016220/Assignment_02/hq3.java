package A_2241016220.Assignment_02;
class Distance{
    int meter;
    int centimeter;

    Distance(int m ,int c){
        if(c>=100){
            m+=c/100;
            c=c%100;
        }
        meter=m;
        centimeter=c;
    }
    void display(){
        System.out.println(meter+"m "+centimeter+"cm");
    }
    Distance sum(Distance d1 , Distance d2){
        return new Distance(d1.meter+d2.meter,d1.centimeter+d2.centimeter);
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(10,60);
        d1.display();
        Distance d2 = new Distance(7,50);
        d2.display();
        Distance d3 = d2.sum(d1,d2);
        d3.display();
    }
}
