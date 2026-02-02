package hellowaorldcom.company;
import java.io.*;
public class excep {
    public static void main(String args[]){
        try {
            FileReader n = new FileReader("text.txt");
            System.out.println("Opened File");
            throw new FileNotFoundException("File not found");
        }catch(Exception e){
            System.out.println("exception" + e);
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }
}
