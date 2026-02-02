package hellowaorldcom.company;
import java.io.*;
public class Writer {
    public static void main(String args[]){
        try {
           FileWriter f = new FileWriter("C:\\Users\\manoj\\IdeaProjects\\untitled\\src\\hellowaorldcom\\company\\hello.txt");
            f.write("This is the program to write the content in the file");
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    }

