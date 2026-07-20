import java.util.Scanner;
public class arr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of elements:");
    int n=sc.nextInt();
    int[]ar=new int[n];
    System.out.println("enter "+n+" elements");
    for(int i=0;i<n;i++){
    ar[i]=sc.nextInt();
    }
    System.out.print("array elements:");
    for(int i=0;i<n;i++){
        System.out.print(ar[i]+" ");
    }
    int sum=0;
    int sec=0;
    for (int i=0;i<n;i++){
        sum=sum+ar[i];
    }
    int target=ar[0];
    for(int i=0;i<n;i++){
       if(ar[i]>target){
        target=ar[i];
       }
    }
    System.out.print("sum of array:");
    System.out.println(sum);
    System.out.print("largest:");
    System.out.println(target);
    }
}
