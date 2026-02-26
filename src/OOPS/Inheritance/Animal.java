package OOPS.Inheritance;

public class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
    class Lion extends Animal{
        void roar(){
            System.out.println("raoring");
        }
    }
class Driver12{
    public static void main(String[] args) {
        Lion l1=new Lion();
        l1.eat();
        l1.roar();
    }
}




