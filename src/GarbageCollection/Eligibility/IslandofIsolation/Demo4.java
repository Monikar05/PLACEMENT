package GarbageCollection.Eligibility.IslandofIsolation;

public class Demo4 {
    Demo4 ref;
}
class driver{
    static void main(String[] args) {
        Demo4 obj1=new Demo4();
        Demo4 obj2=new Demo4();

        obj1.ref=obj2;
        obj2.ref=obj2;

        obj1=null;
        obj2=null;
    }
}