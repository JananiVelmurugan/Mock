class Vehicle{
 public void drive(){
  System.out.println("I am in Vehicle drive");
 }
}

class Car extends Vehicle{
 public void drive(){
  System.out.println("I am in Car drive");
 }
}

class Bike extends Vehicle{
 public void drive(){
  System.out.println("I am in Bike drive");
 }
}

public class TestVehicle{
 public static void main(String[] args){
  Vehicle v = new Vehicle();
  v.drive();

  Car c = new Car();
  c.drive();
  
  Vehicle car = new Car();
  Vehicle bike = new Bike();

  Car cc = new Vehicle();
  Bike bb = new Vehicle();
 }
}
