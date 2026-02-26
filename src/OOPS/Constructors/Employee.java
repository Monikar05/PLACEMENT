package OOPS.Constructors;
//class with attributes with using this keyword
public class Employee {
    String Name;
    int ID;
    int Phone;
    String Dept;
    public Employee(String Name,int ID,int Phone, String Dept) {
        this.Name = Name;
        this.ID = ID;
        this.Phone = Phone;
        this.Dept = Dept;
    }
    void EmplDetails() {
        System.out.println("Employee name:" + this.Name);
        System.out.println("Employee ID:" + this.ID);
        System.out.println("Employee Phone number:" + this.Phone);
        System.out.println("Employee Department:" + this.Dept);
    }
}
class Driver{
    static void main() {
        Employee e1=new Employee("ABC",001,9876756,"Marketing");
        e1.EmplDetails();
        Employee e2=new Employee("CDE",002,9342332,"Marketing");
        e2.EmplDetails();
    }
}

