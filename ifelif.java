import java.util.Scanner;
public class ifelif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the years of experience:");
        int exp = sc.nextInt();
        if (exp >6 ) {
            System.out.print("30% bonus");
        }else if(exp>2){
            System.out.print("20% bonus");
        }
        else {
            System.out.print("10% bonus");
        }
        }
    }      
