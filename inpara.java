import java.util.Scanner;
class rect{
    int l;
    int b;
    rect(int l,int b){
        this.l=l;
        this.b=b;
    }
    int area(){
        return l*b;
    }
}
public class inpara{
    public static void main(String[] args) {
        System.out.print("enter the length:");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        System.out.print("enter the breath:");
        int b=sc.nextInt();
        rect r=new rect(l,b);
        System.out.println(r.area());
    }
}
