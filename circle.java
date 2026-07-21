abstract class shape{
    abstract void display();
}
class draw extends shape{
    void display(){
        System.out.println("drawing circle");
    }
}
public class circle {
    public static void main(String[] args) {
    draw d=new draw();
    d.display();
}
}
