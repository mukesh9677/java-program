import java.util.Scanner;
public class nesif2{
    public static void main(String[]args){
        System.out.print("enter your CGPA:");
        Scanner sc=new Scanner(System.in);
        float CGPA=sc.nextFloat();
        boolean arrear=false;
        if(CGPA>=7){
            if(!arrear){
            System.out.print("eligible for placement");
        }else{
            System.out.print("not eligible for placement");
        }

    }
}
}