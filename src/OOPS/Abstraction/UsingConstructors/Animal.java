package OOPS.Abstraction.UsingConstructors;

abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}
class Cat extends Animal{

    Cat() {
        System.out.println("cat constructor");
}
    void sound() {
        System.out.println("cat sounds as meow");
}
}
class Con{
    static void main(String[] args) {
        Cat c=new Cat();
        c.sound();
    }
}


