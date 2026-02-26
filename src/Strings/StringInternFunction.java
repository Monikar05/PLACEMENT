package Strings;

public class StringInternFunction {
    static void main(String[] args) {
        String s1=new String("Hello");
        String s2="Hello";
        String s3=s1;//checks the string pool
        System.out.println(s1==s3);//False
        System.out.println(s2==s3);//True
    }
}
/*intern() will check the string constat pool if it present it returns true or it will returns false
* means s1 points to different object created outside the pool
* s2 is pointing to Hello copy which is stored in string constant pool(SCP)
* then s3 will checks if s2 copy is present in scp if it present it returns true else false*/