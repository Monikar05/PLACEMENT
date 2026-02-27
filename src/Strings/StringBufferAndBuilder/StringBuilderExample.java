package Strings.StringBufferAndBuilder;

public class StringBuilderExample {
    public void StringAppend(){
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("old string:"+sb);
        sb.append("Wolrd");
        System.out.println("New string:"+sb);
    }
    public void StringInsert(){
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("old string:"+sb);
        sb.insert(2,"EEEEE");
        System.out.println("New string:"+sb);
    }
    public void StringReverse(){
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("old string:"+sb);
        sb.reverse();
        System.out.println("New string:"+sb);
    }
    static void main(String[] args) {
        StringBuilderExample obj=new StringBuilderExample();
        obj.StringAppend();
        obj.StringInsert();
        obj.StringReverse();
    }
}


