class Sanjai{
    String name;
    int age;
    String dept;
    void display(){
        System.out.println(name+"  "+age+"  "+dept);
    }
    }
class Ram{
    String name;
    int age;
    String dept;
    void display(){
        System.out.println(name+"  "+age+"  "+dept);
    }
    }
class Sri{
    String name;
    int age;
    String dept;
    void display(){
        System.out.println(name+"  "+age+"  "+dept);
    }
    }
public class obje {
    public static void main(String[] args) {
        Sanjai s=new Sanjai();
        Ram r=new Ram();
        Sri i=new Sri();
        s.name="Sanjai";
        s.age=19;
        s.dept="IT";
        r.name="Ram";
        r.age=20;
        r.dept="IT";
        i.name="Sri";
        i.age=21;
        i.dept="IT";
        s.display();
        r.display();
        i.display();
    }
}
