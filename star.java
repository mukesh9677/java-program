import java.util.Scanner;
public class star {
    public static void main(String[]args){
        System.out.print("enter the number of rows and columns:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }
        System.out.println();
    }
    }
}
