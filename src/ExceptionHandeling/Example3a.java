package ExceptionHandeling;
//example for throw without using try and by using if and else condition
public class Example3a {
    static void checkAge(int age){
        if(age>=18){
            System.out.println("Eligible-Access granted");
        }else{
            throw new RuntimeException("Not Eligible-Access granted");
        }
    }

    static void main(String[] args) {
        checkAge(21);
        checkAge(3);
    }
}
/*use throw here-which allow us to throw an exception by ourself*/