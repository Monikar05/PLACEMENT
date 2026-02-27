package Strings.StringBufferAndBuilder;


public class BufferAndBuilderSpeed {
    static void main() {
        long startTime = System.currentTimeMillis();//will store the current time in our system
        StringBuffer sbf = new StringBuffer("placement");
        for (int i = 0; i < 1000000; i++) {
            sbf.append("Training");
        }
        System.out.println("time taken by string buffer: " +  (System.currentTimeMillis() - startTime) + "ms");
        //this System.currentTimeMillis() will copy the current time after the execution of for loop

        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("placement");
        for (int i = 0; i < 1000000; i++) {
            sbl.append("Training");
        }
        System.out.println("time taken by string builder: " +  (System.currentTimeMillis() - startTime) + "ms");
    }
}


















































































