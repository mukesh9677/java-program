import java.util.Scanner;
class swit{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        switch(n)
        {
            case (1):
            System.out.print("meals");
            break;
            case (2):
            System.out.print("chicken");
            break;
            case (3):
            System.out.print("biriyani");
            break;
            default:
            System.out.print("no other dish");
        }
    }
}