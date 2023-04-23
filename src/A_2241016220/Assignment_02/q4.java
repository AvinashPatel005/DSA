package A_2241016220.Assignment_02;

class Product {
    int pid;
    double price;
    static double tot_price;

    public Product(int pid, double price){
        this.pid=pid;
        this.price=price;
        tot_price+=price;
    }
    public void display(){
        System.out.println("Product Id: "+pid+" Price: "+price);
    }

    public static void main(String[] args) {
        Product p1 = new Product(101,20);
        Product p2 = new Product(103,250);
        Product p3 = new Product(115,10);
        Product p4 = new Product(151,170);
        Product p5 = new Product(114,29);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        System.out.println("Total Amount: "+tot_price);

    }
}
