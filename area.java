import java.util.Scanner;
class square{
    int a;
    square(int a){
        this.a=a;
    }
    int ar()
    {
    return a*a;
    }
}
public class area {
    public static void main(String[] args) {
        System.out.print("enter the area:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        square s=new square(a);
        System.out.print(s.ar());
    }
}
