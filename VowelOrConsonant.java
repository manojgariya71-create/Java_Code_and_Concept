package hellowaorldcom.company;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a single Alphabet");
        char ch=s.next().charAt(0);
        ch=Character.toLowerCase(ch);
        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch+" "+"is a vowel");
            }else{
                System.out.println(ch+" "+"is a consonant");
            }
        }else{
            System.out.println("The Character entered is not an alphabet");
        }
        s.close();
    }
}
