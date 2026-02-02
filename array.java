package hellowaorldcom.company;
import java.util.Scanner;
public class array {
    public static void main(String [] args){
        Scanner n=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the value");
        for(int i=0;i<arr.length;i++){
            arr[i]=n.nextInt();
        }
        System.out.println("Array element");
        for(int ele:arr){
            System.out.println(ele+" ");
        }
        System.out.println("Insert element at index");
        int c=n.nextInt();
        arr[1]=c;
        System.out.println("updated array");
        for(int ele:arr){
            System.out.println(ele +"");
        }
    }
}
