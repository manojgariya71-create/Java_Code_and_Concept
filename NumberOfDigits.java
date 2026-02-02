package hellowaorldcom.company;
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int count=0;
        int num=Math.abs(n);
        if(num==0){
            count=1;
        }else{
            while(num>0){
                num=num/10;
                count++;
            }
        }
        System.out.println("The number of digits:"+count);
    }
}
