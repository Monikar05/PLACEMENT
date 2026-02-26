package OOPS.Abstraction.UsingConstructors.WithArguments;

abstract class Bank {
    String branch;
    Bank(String branch) {
        System.out.println("BRANCH:"+branch);
        this.branch = branch;
    }
    abstract void calInterest();
}
class HDFC extends Bank{

    HDFC(String branch) {
        super(branch);
    }

    void calInterest(){
        System.out.println("Interest is calculated");
    }
}
class Arguments{
    static void main(String[] args) {
        HDFC h = new HDFC("BANGLORE");
        h.calInterest();
    }
}