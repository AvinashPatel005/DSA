package A_2241016220.Assignment_02;

class RestaurantMeal{
    String foodName;
    double foodPrice;

    public RestaurantMeal(String fName, double fPrice) {
        foodName = fName;
        foodPrice = fPrice;
    }

    void display1(){
        System.out.print("A \""+foodName+"\" costing Rs "+foodPrice);
    }
}
class HotelService extends RestaurantMeal{
    HotelService(String fName,double fPrice){
        super(fName,fPrice);
    }
    String serviceName;
    double serviceFee;
    String serviceRoom;
    void display2(){
        System.out.println(" is a \""+serviceName+"\" provided to room "+serviceRoom+" for a Rs "+serviceFee+" fee.");
    }
}
class RoomServiceMeal extends HotelService{
    RoomServiceMeal(String food_name,double price,String room) {
        super(food_name,price);
        serviceName = "room service";
        serviceFee = 24;
        serviceRoom = room;
    }
    void display(){
        display1();
        display2();
        System.out.println("Total bill is: Rs "+(serviceFee+foodPrice));
    }
}
class demo1{
    public static void main(String[] args) {
        RoomServiceMeal r = new RoomServiceMeal("Biryani",120,"BH9 510");
        r.display();
    }
}
