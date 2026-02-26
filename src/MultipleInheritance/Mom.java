package MultipleInheritance;

interface Mom {
    default void cook(){
        System.out.println("Indian");
    }
}
interface Dad{
    default void cook(){
        System.out.println("Chinees");
    }
}
class Child implements Mom,Dad{
    @Override
    public void cook() {
        Mom.super.cook();
        Dad.super.cook();
    }
}
class Driver{
    static void main(String[] args) {
        Child c=new Child();
        c.cook();
    }
}