package OOPS.Abstraction.Interfaces.CompleteAbstract.DefualtMthod;

public interface Vehicle {
    void start();
    default void stop(){
        System.out.println("Vehicles stop");
    }
}
class Audi implements Vehicle{
    public void start(){
        System.out.println("Audi Vehicles start");
    }
}
class BMW implements Vehicle{
    public void start(){
        System.out.println("BMW Vehicles start");
    }
}
class Benz implements Vehicle{
    public void start(){
        System.out.println("Benz Vehicles start");
    }
}
class Defaultmethod{
    static void main(String[] args) {
        Audi c1=new Audi();
        c1.start();
        c1.stop();
        Benz c3=new Benz();
        c3.start();c3.stop();
    }
}

