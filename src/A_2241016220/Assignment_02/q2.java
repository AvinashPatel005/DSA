package A_2241016220.Assignment_02;

class Complex {
    int real,imag;

    public void setData(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    public void display(){
        System.out.println(real+"+"+imag+"i");
    }
    public Complex add(Complex c1, Complex c2){
        Complex c = new Complex();
        c.setData(c1.real+c2.real, c1.imag+ c2.imag);
        return c;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.setData(2,3);
        c2.setData(4,7);
        Complex c = c1.add(c1,c2);
        c1.display();
        c2.display();
        c.display();
    }
}
