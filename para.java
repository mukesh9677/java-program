class stud1{
    String name;
    stud1(String name){
    this.name=name;
    }
    void display(){
        System.out.println(name);
    }
}
class stud2{
    String name;
    int age;
    stud2(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+"  "+age);
    }
}
class stud3{
    String name;
    int age;
    String dept;
    stud3(String name,int age,String dept){
        this.name=name;
        this.age=age;
        this.dept=dept;
    }
        void display(){
            System.out.println(name+"  "+age+"  "+dept);
        }
}
public class para {
    public static void main(String[] args) {
        stud1 s1=new stud1("ram");
        s1.display();
        stud2 s2=new stud2("mukesh", 19);
        s2.display();
        stud3 s3=new stud3("sri",20,"IT");
        s3.display();
    }
}

