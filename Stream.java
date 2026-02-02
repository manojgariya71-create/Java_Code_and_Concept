package hellowaorldcom.company;
import java.io.*;
public class Stream {
    public static void main(String args[]) {
        try {
            FileInputStream f = new FileInputStream("C:\\Users\\manoj\\IdeaProjects\\untitled\\src\\hellowaorldcom\\company\\hello.txt");
            int i =0;
            while((i=f.read())!=-1) {
                System.out.println((char) i);
            }
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
