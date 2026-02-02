package hellowaorldcom.company;
import java.util.Scanner;
public class DoubleWithoutArithmetic {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int doubled=num<<1;
        System.out.println("Double of "+num+" is : "+doubled);
        s.close();
    }
}
