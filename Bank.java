import java.util.Scanner;
class Bank{
    private int initialbalance;
    private int depositamount;
    private int withdrawamount;
   public Bank(int initialbalance,int depositamount,int withdrawamount){
    this.initialbalance=initialbalance;
    this.depositamount=depositamount;
    this.withdrawamount=withdrawamount;
   }
    public int getbalance(){
        return initialbalance+depositamount-withdrawamount;
    }
}
public class Bank{

    public static void main(String[] args) {
       Bank b = new Bank(1000,500,200);
       System.out.println("current balance:"+b.getbalance());
    }
}