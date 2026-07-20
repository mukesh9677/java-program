class Car{
    String name;
    int milage;
    Car(String name,int milage){
        this.name=name;
        this.milage=milage;
    }
    void display(){
        System.out.println(name+"  "+milage);
    }
}
public class cons {
    public static void main(String[]args) {
        Car c=new Car("bmw",19);
        c.display();
    }
}
