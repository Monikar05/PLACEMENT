package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringFunctions {
    static void main(String[] args) {
        String s1="Java Programming";
        String s2=new String("Java Programming");
        System.out.println("Original string is:"+s1);

        //length()-to check the length of the string include space
        System.out.println("Length is:"+s1.length());

        //charAt
//        System.out.println("Character at:"+charAt(2));

        //toUpperCase()and toLowerCase()
        System.out.println("UPPERCASE:"+s1.toUpperCase());
        System.out.println("Lowercase:"+s1.toLowerCase());

        //equlas() and ==
        System.out.println("Using ==:" +(s1==s2));
        System.out.println("Using equals :"+s1.equals(s2));

        //compareTo()-works with  strings asci values called lexicographical comparision9
        System.out.println("Using CompareTo():"+s1.compareTo(s2));

        //substring()-will returns substring from specified index to end index
        System.out.println("SubString is:"+s1.substring(0,5));

        //contain()-cheks if it present or not in string
        System.out.println("Is contains:"+s1.contains("java"));

        //indexOf()-provide index of particular specified word
        System.out.println("Using index of:"+s2.indexOf("a"));

        //replace()-replace something with other thing,requires 2 values to be mentioned
        System.out.println("Using replace toreplace the value:"+s1.replace("Programming","Program"));
        System.out.println(s1);

        //startsWith() and endsWith()--returns true or false
        System.out.println("using start with:"+s1.startsWith("Java"));
        System.out.println("using ends with:"+s1.endsWith("Java"));

        //trim()-removes the extra space
        String s3="             ABC            ";
        System.out.println("Using Trin:"+s3.trim());
        System.out.println("original s3 is:"+   s3);

        //concat()-concate in to the sring does not affect the original string
        System.out.println("Using concat:"+s1.concat(" Object Oriented"));
        System.out.println(s1);

        //isEmpty()-tells true of false(consider spaces as one value)
        String s4="";
        String s5="   ";
        System.out.println("Using isEmpty():"+s4.isEmpty());
        System.out.println("Using isEmpty():"+s5.isEmpty());

        //split()-split the string on specified value like spaces
        String s6="Sapthagiri collage of enginerrring";
        String[] arr=s6.split(" ");
        //System.out.println(Arrays.toString(arr));
        System.out.println("without Using Split function:"+s6);
        for (String i:arr)
        System.out.println(i);
    }
}
