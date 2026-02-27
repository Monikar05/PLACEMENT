package GarbageCollection.AchieveGC;

import java.sql.SQLOutput;

public class Demo {
    public void finalize(){
        System.out.println("garbage collected");
    }

    static void main(String[] args) {
        for(int i=0;i<100000;i++){
        Demo obj=new Demo();
        obj=null;
    }
    System.gc();//ment for achievinh garbage collection means it happens only when System.gc is called
}
}