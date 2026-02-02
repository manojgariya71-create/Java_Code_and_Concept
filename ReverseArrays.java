package hellowaorldcom.company;
import java.util.Scanner;
public class ReverseArrays {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=s.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        int start=0;
        int end=array.length-1;
        int rev;
        while(start<=end){
            rev=array[start];
            array[start]=array[end];
            array[end]=rev;
            start++;
            end--;
        }
        System.out.println("Reversed Array: ");
        for(int ele:array){
            System.out.println(ele+" ");
        }
    }
}
