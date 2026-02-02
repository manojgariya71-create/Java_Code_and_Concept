package hellowaorldcom.company;
import java.util.Scanner;
public class arg {
    public int fact(int n){
        int f=1;
        if(n==1){
            return 1;
        }else{
            f= n * fact(n-1);
        }
        return f;
    }
    public static void main(String args[]){
        Scanner m=new Scanner(System.in);
        System.out.println("Enter the fact you want");
        int n=m.nextInt();
        arg s=new arg();
        int f1=s.fact(n);
        System.out.println(f1);
    }
}
