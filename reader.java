package hellowaorldcom.company;
import java.io.*;
public class reader {
    public static void main(String args[]){
        try {
            FileReader f = new FileReader("C:\\Users\\manoj\\IdeaProjects\\untitled\\src\\hellowaorldcom\\company\\hello.txt");
            int i=0;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
