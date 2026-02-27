package ExceptionHandeling;

import java.lang.classfile.attribute.ModuleMainClassAttribute;

public class Example1 {
    static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 2;
        try {
            k = i / j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[10]);
        } catch (ArithmeticException e) {
            //System.out.println(e);//we can print the eror message or our own error message
            System.out.println("Undefined");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid exception");
        }catch(Exception e){
            System.out.println("Unknown exception occurs");
        }finally{
            System.out.println("finally block will excecute atleast once");
        }
        System.out.println("Hello");
    }static{
        System.out.println("Excecution starts");
    }
}

/* finally and static blocks are used
-finally--will excute atleast once
-static--will execute everytime before even try block starts execution
 */

