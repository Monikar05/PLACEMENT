package Method;

public class MethodProb {
    //it is not possible by call by values  because java supports only call by reference
//    void swap(int a, int b){
//        int temp;
//        temp=a;
//        a=b;
//        b=temp;
//    }
//    static void main() {
//        MethodProb mb=new MethodProb();
////            int swapped=mb.swap(10,20);
////            mb.swap(10,20);
//        int a=10,b=20;
//        System.out.println("Before swap a:"+a+"b:"+b);
//        mb.swap(a,b);
//        System.out.println("After swap a:"+a+"b:"+b);
//    }

//call by reference
void swap(int arr[]){
    int temp;
    temp=arr[0];
    arr[0]=arr[1];
    arr[1]=temp;
}
    static void main() {
        MethodProb mb=new MethodProb();
//            int swapped=mb.swap(10,20);
//            mb.swap(10,20);
        int arr[]={10,20};
        System.out.println("Before swap a:"+arr[0]+"b:"+arr[1]);
        mb.swap(arr);
        System.out.println("After swap a:"+arr[0]+"b:"+arr[1]);
    }
}
