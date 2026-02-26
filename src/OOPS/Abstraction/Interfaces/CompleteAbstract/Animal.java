package OOPS.Abstraction.Interfaces.CompleteAbstract;

public interface Animal {

    void sound();//abstract method
    //void run();

    /*100 abstarction accurs here by using default*/
    default void run(){/* is used in order to write something with in our abstracted function
    means dont have to write call it in child class like as static in abstract */
        System.out.println("running");
    }
    static void color(){
        System.out.println("Color is in static method ");
    /* by using statiic wew can also access functions using its class */
    }
}
class Lion implements Animal{
    public void sound(){
        System.out.println("roar");
    }
   /* public void run(){
        System.out.println("Lion running");
    }
    it is commented because the specified method is default*/
}
class Completeand100Abstractions{
    static void main(String[] args) {
        Lion l=new Lion();
        l.sound();
        l.run();
        Animal.color();
    }
}
/*because of the use of Static and default in Java 100percent abstarction is not possible*/