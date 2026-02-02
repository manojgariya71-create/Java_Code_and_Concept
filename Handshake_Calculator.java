package hellowaorldcom.company;
import java.util.Scanner;
public class Handshake_Calculator {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of person");
        int n=s.nextInt();

        int handshakes=n*(n-1)/2;
        System.out.println("Maximum no of handshakes possible: "+handshakes);
        s.close();
    }
}
