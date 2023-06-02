package A_2241016220.Assignment_02;
class Book {
    String BName;
    int BEdition;
    double BPrice;

    public Book(String BName, int BEdition, double BPrice) {
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }
    void display(){
        System.out.println(BName+"\t"+BEdition+"\t"+BPrice);
    }
}
class Demo_For_Book{
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0]=new Book("DSA",2,499);
        books[1]=new Book("IGT",7,299);
        books[2]=new Book("CALCULUS",8,799);

        double maxPrice=0;
        int maxIn=0;

        for(int i=0;i<books.length;i++){
            if(books[i].BPrice>maxPrice) {
                maxPrice = books[i].BPrice;
                maxIn=i;
            }
        }

        System.out.println("Book of highest price is:");
        books[maxIn].display();
    }
}
