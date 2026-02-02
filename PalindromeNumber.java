package hellowaorldcom.company;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a integer :");
        int num=s.nextInt();
        int originalNum=num;
        int reversedNum=0;
        num=Math.abs(num);
        while(num>0){
            int digit=num%10;
            reversedNum= reversedNum*10+digit;
            num=num/10;
        }
        if(reversedNum==Math.abs(originalNum)){
            System.out.println(originalNum+" is a palindrome");
        }else{
            System.out.println(originalNum+" is not a palindrome");
        }
    }
}
