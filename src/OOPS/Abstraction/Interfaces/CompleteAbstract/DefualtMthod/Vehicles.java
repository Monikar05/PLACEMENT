package OOPS.Abstraction.Interfaces.CompleteAbstract.DefualtMthod;

public interface Vehicles {
    void start();
}
class Car implements Vehicles{
    public void start(){
        System.out.println("Car startted");
    }
}
class Bike implements Vehicles{
    public void start(){
        System.out.println("Bike startted");
    }
}
class Driver{
    static void main(String[] args) {
        Vehicles v1=new Car();
        v1.start();
        Vehicles v2=new Bike();
        v2.start();
    }
}