package Strings;

public class StringImmutable {
    static void main(String[] args) {
        String str="Hello";
        str.concat(" World");
        System.out.println(str);

        str=str.concat("world");
        System.out.println(str);
    }
}
