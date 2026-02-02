package hellowaorldcom.company;
import java.util.Scanner;
public class Hello1 {
    public int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public int maximum(int arr[]){
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Element ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Hello1 obj=new Hello1();
        int s=obj.maximum(a);
        int t=obj.min(a);
        System.out.println("The Maximum element is"+" "+s);
        System.out.println("The min is :-"+t);
    }
}
