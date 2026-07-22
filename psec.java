import java.util.Scanner;
public class psec {
static void obj(String str)throws Exception{
   if(str.length()<8){
    throw new Exception("weak");
   }else{
    System.out.println("strong");
   }
}


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        try{
        obj(str);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }  
}
