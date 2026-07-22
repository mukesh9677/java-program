import java.util.Scanner;
public class ariexe {
    public static void main(String[]args){
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter age:");
    i=sc.nextInt();
    if(i<18){
    throw new ArithmeticException("you are not eligible");
    }else{
        System.out.print("you are eligible");
    }
    }
}
