
/*assessment using constructors and inheritance*/

package OOPS.Assessment;

class Student extends Person {
    int USN;

     Student(String FName,String LName,int USN){
         super(FName,LName);  /*in inheritance two constructors cannot inherit each other for that we need
         use super keyword by making space for the parent class attributes*/
        this.USN=USN;
    }
}
class Person{
    String FName;
    String LName;

    public Person(String FName,String LName){
        this.FName=FName;
        this.LName=LName;
    }
}
class Driver{
    static void main(String[] args) {
        Student s1=new Student("ABC","XYZ",123);

    }
}
