package ExceptionHandeling;
//example for throw with using try and catch
public class Example3b {
    static void main(String[] args) {
        try{
            int balance=2000;
            int withdraw=3000;
            if(withdraw > balance){
                throw new ArithmeticException("Insufficient balance");
            }
            System.out.println("Withdraw successful");
        }catch(ArithmeticException e){
            System.out.println("Exception is:"+e.getMessage());
        }
    }
}
