import java.util.Scanner;
class pali{
    public static void main(String[]args){
    System.out.print("enter number:");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int m=num;
    int rev=0;
    while(num>0){
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
    }
    if(rev==m){
        System.out.println("palindrome");
    }else{
        System.out.println("not palindrome");
        
    }
}
}