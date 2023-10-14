package Inheritence.Q5;

import java.util.Scanner;

class Shape{
    protected double area;
    public void computeArea(){
        area=0;
    }
}
class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea(){
        area=(3.14)*radius*radius;
    }
}
class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void computeArea(){
        area=length*breadth;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void computeArea(){
        area=(1.0/2)*base*height;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s;
        int option = sc.nextInt();
        switch(option){
            case 1: double r = sc.nextDouble();
                    s = new Circle(r);
                    s.computeArea();
                    System.out.printf("%.2f",s.area);
                    break;
            case 2: double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    s = new Rectangle(l,b);
                    s.computeArea();
                    System.out.printf("%.2f",s.area);
                    break;
            case 3: double base = sc.nextDouble();
                    double h = sc.nextDouble();
                    s = new Triangle(base,h);
                    s.computeArea();
                    System.out.printf("%.2f",s.area);
                    break;
            default:
                System.out.println("Invalid Input");
        }
    }
}