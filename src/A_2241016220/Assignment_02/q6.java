package A_2241016220.Assignment_02;

abstract class Shape {
    abstract void area();
    public static void main(String[] args) {
        Shape s1 = new Square(10);
        s1.area();
        Shape s2 = new Triangle(8,6,10);
        s2.area();
        Shape s3 =new Circle(5);
        s3.area();
    }
}
class Square extends Shape {
    double s;
    Square(int s){
        this.s=s;
    }
    void area() {
        System.out.println("Area of Square with side is "+(s*s));
    }
}
class Triangle extends Shape {
    double s1,s2,s3;
    Triangle(int s1,int s2,int s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    void area() {
        double s=(s1+s2+s3)/2;
        double area=Math.sqrt((s*(s-s1)*(s-s2)*(s-s3)));
        System.out.println("Area of Triangle is "+area);
    }
}
class Circle extends Shape {
    double r;
    Circle(double r){
        this.r=r;
    }
    void area() {
        System.out.println("Area of Circle is "+(Math.PI*r*r));
    }
}