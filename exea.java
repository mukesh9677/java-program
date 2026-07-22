
import java.util.Scanner;
public class exea {
    public static void main(String[]args){
    int []arr={10,20,30,40,50};
    try{
        Scanner sc=new Scanner(System.in);
        int div=sc.nextInt();
        int dis=sc.nextInt();
        int index=sc.nextInt();
        System.out.println("result:"+div/dis);
        System.out.println(arr[index]);
    }
    
    catch(ArrayIndexOutOfBoundsException d){
      System.out.println(d);
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
}
}

