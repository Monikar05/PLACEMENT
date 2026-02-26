package OOPS.Constructors;

public class ConstructorDemo {
    ConstructorDemo(){
        System.out.println("Iam A Constructor");
    }
}
class Driver3{
    static void main() {
        ConstructorDemo d1=new ConstructorDemo();
        ConstructorDemo d2=new ConstructorDemo();
    }
}
/*constructors can be used as a default constructors  this is the exmaple
for that where without cretaing a constructor ,constructor is creasted
in order to create the object
even if we dont create demo() the default constructor will be created in backend
if it is manually created then in backend it wont be created
 */