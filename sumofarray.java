package hellowaorldcom.company;
import java.util.Scanner;
public class sumofarray {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=s.nextInt();
        int []array=new int[n];
        int sum=0;
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
