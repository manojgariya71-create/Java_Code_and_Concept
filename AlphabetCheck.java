package hellowaorldcom.company;
import java.util.Scanner;
public class AlphabetCheck {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch=s.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
        {
            System.out.println(ch+" "+"is an alphabet");
        }else{
            System.out.println(ch+" "+"is not an alphabet");
        }
        s.close();
    }
}
