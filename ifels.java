import java.util.Scanner;
public class ifels{
    public static void main(String[]args){
       
        Scanner sc= new Scanner(System.in);
         System.out.print("enter your withdrawl amount:");
        int num = sc.nextInt();
        System.out.print("enter your balance:");
        int bal = sc.nextInt();
        if(num>=bal){
            System.out.println("insuffecient balance");
        }else{
            System.out.println("suffecient balence");
        }

    }

} 

