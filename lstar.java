import java.util.Scanner;
public class lstar {
    public static void main(String[]args){
        System.out.print("enter num of times:");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        for (int n=1;n<=i;n++){
            for(int j=1;j<=n;j++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
