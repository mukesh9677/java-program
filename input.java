import java.util.Scanner;
public class input{
    public static void main(String[]args){
     System.out.print("enter youe name:");
     Scanner sc=new Scanner(System.in);
     String name=sc.nextLine();
     System.out.print("enter your age:");
     int age=sc.nextInt();
     System.out.print("enter your department:");
     String dept=sc.next();
     System.out.print("enter your mobile number:");
     long ph =sc.nextLong();
    }
}