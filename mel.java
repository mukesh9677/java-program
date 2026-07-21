import java.util.Scanner;

class mel{
    void display(){
        System.out.println("invalid employee type");
    }
}
class Manager extends mel{
    void display(){
        System.out.println("Manager manages the team.");
    }
}
class developer extends mel {
    void display(){
        System.out.println("Developer writes code>");
    }
}
public static void main(String[]args){

}
