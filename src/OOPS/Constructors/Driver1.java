package OOPS.Constructors;
// class with attributes without using this keyword
 class Car {
    String BrandName;
    int ManuDate;
    String Color;
    public Car(String BName,int MDate,String C){
         BrandName=BName;
         ManuDate=MDate;
         Color=C;
    }

void PrintDetails(){
    System.out.println("Car BrandName is"+BrandName);
    System.out.println("Car ManuDate is "+ManuDate);
    System.out.println("Car color is "+Color);
}}

public class Driver1{
    static void main(String[] args) {
        Car c1 = new Car("Audi", 2000, "Black");
        c1.PrintDetails();
  }
}

/*this is constructor we used before which is a difeerent function so it will be confused which brandname should i choose
we use this key word to clear the confusion means we use this key word when both attributes are same
if we havw different one we cannot use this.
 */
