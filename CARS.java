package object;
class Car {
    String name;
    int year;
    int price;
    Car(String name,int year,int price){
     this.name=name;
     this.year=year;
     this.price=price;
    }
    void display(){
        System.out.println(name);
        System.out.println(year);
        System.out.println(price);
    }
}

public class CARS {
    public static void main(String[] args) {
        Car car = new Car("totya",2004,1234);
        Car car1 = new Car("BMW",2003,1234473);
        
        car.display();
        System.out.println();
        car1.display();
        
   
    }
}
