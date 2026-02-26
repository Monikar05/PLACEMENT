package OOPS.Constructors;

public class CopyConstructor {
    String name;
    int usn;

    //traditional constructor
    CopyConstructor(String name,int usn){
        this.name=name;
        this.usn=usn;
    }
    //copy constructor
    CopyConstructor(CopyConstructor obj) {/* 2nd constructor refers to first created constructor*/
        this.name=obj.name;
        this.usn=obj.usn;
    }

    void display() {
        System.out.println(name + " " + usn);
    }
}
    class driver4 {
        static void main(String[] args) {
            CopyConstructor s1 = new CopyConstructor("ABC",123);
            CopyConstructor s2 = new CopyConstructor(s1);
            s1.display();//original ABC and 123
            s2.display();//cloned ABC and 123
        }
    }
