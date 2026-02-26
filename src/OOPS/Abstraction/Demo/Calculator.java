package OOPS.Abstraction.Demo;

abstract class Calculator {
    abstract void add();/* forced method which must be called by child class*/
    /*abstrct method cant have body they as to access it by child class*/

    void  sub() {/*this method is not abstracted so no  need to create in the child class*/
         System.out.println("Subtracting");
    }
}
class Calc1 extends Calculator{
    void add(){
        System.out.println("Adding");
    }
}
class Calc2 extends Calculator{
    void add(){
        System.out.println("Addition");
    }
}
class Abstraction {
    static void main(String[] args) {
        Calc1 c1=new Calc1();
        c1.add();
        c1.sub();
        Calc2 c2=new Calc2();
        c2.sub();
        c2.add();
    }
}