import java.util.Scanner;
public class exnull {
    static void check(String str)throws NullPointerException{
        if(str.equals("null")){
            throw new NullPointerException("string is null");
        }else{
            System.out.println(str.length());
        }
    }
    public static void main(String[]args){
    try{
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.next();
        check(str);
    }
    catch(NullPointerException e){
        System.out.println(e);
    }
}
}