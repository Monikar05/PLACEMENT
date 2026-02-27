package Strings.StringBufferAndBuilder;

public class StringBufferExample {
    public void StringAppend() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("old string:" + sb);
        sb.append("Wolrd");
        System.out.println("New string:" + sb);
    }

    public void StringInsert() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("old string:" + sb);
        sb.insert(2, "EEEEE");
        System.out.println("New string:" + sb);
    }

    public void StringReverse() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("old string:" + sb);
        sb.reverse();
        System.out.println("New string:" + sb);
    }

    static void main(String[] args) {
        StringBufferExample obj = new StringBufferExample();
        obj.StringAppend();
        obj.StringInsert();
        obj.StringReverse();
    }
}