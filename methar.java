public class methar {
    static void checkage(int age)throws ArithmeticException{
        if(age<18){
        throw new ArithmeticException("you are not eligible for voting");
        }else{
            System.out.println("eligible");
        }
    }
    public static void main(String[]args){
        try{
            checkage(14);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    } 
}
