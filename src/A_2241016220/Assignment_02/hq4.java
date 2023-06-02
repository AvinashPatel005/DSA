package A_2241016220.Assignment_02;

class PointType{
    private int x;
    private int y;

    PointType(int x,int y){
        this.x=x;
        this.y=y;
    }
    void setCoordinates(int x,int y){
        this.x=x;
        this.y=y;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void printCoordinates(){
        System.out.println("("+x+","+y+")");
    }
}
class CircleType extends PointType{
    double radius;
    CircleType(int x ,int y,double r){
        super(x,y);
        radius=r;
    }
    void setRadius(double r){
        radius=r;
    }
    void printRadius(){
        System.out.println("Radius of Circle is "+radius);
    }
    double getArea(){
        return Math.PI*radius*radius;
    }
    double getCircumference(){
        return  Math.PI*radius*2;
    }
    void setCentre(int x,int y){
        setCoordinates(x,y);
    }
    void getCentre(){
        System.out.print("Centred at: ");
        printCoordinates();
    }
}
class DemoCircle{
    public static void main(String[] args) {
        CircleType c = new CircleType(2,3,5);
        System.out.println("Area of Circle:"+c.getArea());
        System.out.println("Circumference of Circle:"+c.getCircumference());
        c.getCentre();
        c.printRadius();
    }
}
