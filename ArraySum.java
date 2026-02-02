package hellowaorldcom.company;
import java.util.Scanner;
public class ArraySum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter "+n+" element");
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of array element is " +sum);
        s.close();
    }
}
