abstract class water{
abstract void filter();
}
class aqua extends water{
    void filter(){
        System.out.println("mineral");
    }
}
public class abst{
    public static void main(String[] args) {
        aqua a=new aqua();
        a.filter();
    }
}
