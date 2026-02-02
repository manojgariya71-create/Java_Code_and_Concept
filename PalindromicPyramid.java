package hellowaorldcom.company;
import java.util.Scanner;
public class PalindromicPyramid {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int row=1;
        while(row<=n){
            int col=n-row;
            while(col>0){
                System.out.print(" ");
                col--;
            }
            col=row;
            while(col>=1){
                System.out.print(col);
                col--;
            }
            col=2;
            while(col<=row){
                System.out.print(col);
                col++;
            }
            row++;
            System.out.println();
        }

    }
}
