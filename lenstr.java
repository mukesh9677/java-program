import java.util.Scanner;
public class lenstr {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String s=sc.nextLine();
        String su="";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(su.indexOf(ch)==-1){
                su=su+ch; 
            }
            count=su.length();
        }
    System.out.println("given string:"+s);
    System.out.println("sub string:"+su);
    System.out.println("total number of characters:"+count);
    }
}
