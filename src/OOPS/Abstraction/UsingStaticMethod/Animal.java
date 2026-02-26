package OOPS.Abstraction.UsingStaticMethod;

abstract class Animal {
     static void info(){
        System.out.println("Animals are living beings");
    }
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barking");
    }
}
class StaticAbst{
    static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        //d.info();/* shows error becouse static methos is not object method but a class method */
        Animal.info();
    }
}
