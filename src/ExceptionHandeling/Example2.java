package ExceptionHandeling;

public class Example2 {
    static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 2;//if 0 it gives arithmetic or if it is 2 it gives arrayoutofbound exception, only one exception will handled once
        try {
            k = i / j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
/*multithread exception is handeled using | (or) symbol*/