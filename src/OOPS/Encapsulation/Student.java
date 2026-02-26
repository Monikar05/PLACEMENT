package OOPS.Encapsulation;

public class Student {
    private String name; /*now values are protected*/
    private int usn;

    Student (String name,int usn){
        this.name=name;
        this.usn=usn;
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name=name;
    }
    String getUSN(){
        return this.name;
    }
    void setUSN(int name){
        this.usn=usn;
    }
    void display(){
        System.out.println(name+" "+ usn);
    }
}
class driver{
    static void main() {
        Student s1=new Student("Abc",123);
        s1.display();
//        s1.name="david";
//        s1.display(); /*this will change name which is unncessory so we made our attributes as private*/
        System.out.println("name is:"+ s1.getName());
//        System.out.println("Set name is:");
        s1.setName("Monika");
        s1.display();
    }
}