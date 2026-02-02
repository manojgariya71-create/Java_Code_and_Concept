package hellowaorldcom.company;
import java.util.Scanner;
public class Printarray {
    public static void main(String[] args) {
        int n;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = c.nextInt();
        int a[] = new int[n];
        System.out.println("enter the value in element");
        for (int i = 0; i < n; i++) {
            a[i] = c.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);

        }
    }
}