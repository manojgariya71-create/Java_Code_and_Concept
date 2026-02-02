package hellowaorldcom.company;
import java.util.Scanner;
public class print {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the array element are");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
