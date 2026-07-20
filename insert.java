import java.util.Scanner;
public class insert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuffer df=new StringBuffer("java");
        df.insert(4,"program");
        System.out.println(df);
        StringBuffer sf=new StringBuffer("i love book");
        sf.replace(7,11,"gamer");
        System.out.println(sf);
        df.delete(0,4);
        System.out.println(df);
        sf.reverse();
        System.out.println(sf);
        System.out.print("Enter a string to reverse:");
        StringBuffer str=new StringBuffer(sc.nextLine());
        str.reverse();
        System.out.println(str);
    }
}
