import java.util.Scanner;
public class metht {
 static int add(int a,int b)
 {
    return a+b;
 }
 static int sub(int a,int b)
 {
    return a-b;
 }
 static int mul(int a,int b)
 {
    return a*b;
 }
 static int div(int a,int b)
 {
    return a/b;
 }
    public static void main(String[] args) {
         int c=add(7, 9);
         int d= sub(10,5);
         int e=mul(5,4);
         int f=div(72,6);
         System.out.println("addition:"+c);
         System.out.println("subtraction:"+d);
         System.out.println("multiplaction:"+e);
         System.out.println("divivision:"+f);
    }
}
