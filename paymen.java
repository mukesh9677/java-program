
abstract class payment{
    abstract void paym();
}
class pay extends payment{
    void paym(){
class creditcard extends pay{
    void paym(){
    System.out.print("credit card");
    }
}
class upi extends pay{
    void paym(){
        System.out.print("upi");
    }
}
    }
}
public class paymen {
    public static void main(String[]args){
        pay p=new pay();
        p.paym();
    }
}
