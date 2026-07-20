import java.util.Scanner;
public class fact {
    public static void main(String[]args){
        double fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        if(n==0||n==1){
            System.out.print("1");
        }else if(n<0){
            System.out.print("give +ve value");
        }else{
            while(n>1){
                fact=fact*n;
                n--;
            }
            System.out.print(fact);
        }
            
    }
}
