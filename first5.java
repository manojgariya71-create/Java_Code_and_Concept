package hellowaorldcom.company;
import java.util.*;

public class first5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr []=new int[n];
        System.out.println("Enter Elements in Array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Print array");
        for(int m: arr){
            System.out.println(m);
        }
    }
}
