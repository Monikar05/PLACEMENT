package OOPS.Constructors;

public class BankAccount {
    String accountHolder;
    double Balance;

    public BankAccount(String accountHolder,double Balance){
        this.accountHolder=accountHolder;
        this.Balance=Balance;
    }
    void Deposit(double Amount){
        Balance+=Amount;
        System.out.println("Amount Deposited:"+Amount);
        System.out.println("Updated Balance:"+this.Balance);
    }
    void withdraw(double Amount){
        if(Amount<+Balance){
            Balance=Balance-Amount;
        }
        else if(Amount>Balance){
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance(){
        System.out.println("Account Holder name is:"+this.accountHolder);
        System.out.println("Current Balance is:"+this.Balance);
    }
}
class Driver2{
    static void main() {
        BankAccount ba=new BankAccount("Asha",5000);
        ba.withdraw(4000);
        ba.displayBalance();
        ba.Deposit(2000);
        ba.displayBalance();
    }
}
//example program for assignment