import java.util.*;
abstract class shape{
    abstract double area();
}
class circle extends shape{
     double r;
     circle(double r){
        this.r=r;
     }
    double area(){
        return 3.14*r*r;
    }
}
class rect extends shape{
    double l;
    double b;
    rect(double l,double b){
        this.l=l;
        this.b=b;
    }
    double area(){
        return l*b;
    }
}
public class coar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type=sc.next();
        shape s;
        if(type.equals("circle")){
          double r=sc.nextDouble();
          s=new circle(r);
        }else if (type.equals("rectangle")){
                double l=sc.nextDouble();
                double b=sc.nextDouble();
                s=new rect(l, b);
            }
        }
    System.out.printf("%.2f", s.area());
    }
