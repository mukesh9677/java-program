import java.util.Scanner;
public class strtoint {

    public static void main(String[] args){
    try{
        int i;
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        System.out.println(Integer.parseInt(str));
    }
    catch(NumberFormatException n){
       System.out.println("invalid string");
    }
}
}
