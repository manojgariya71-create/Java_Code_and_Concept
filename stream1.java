package hellowaorldcom.company;
import java.io.*;
public class stream1 {
        public static void main(String args[]) {
            try {
                FileOutputStream f = new FileOutputStream("C:\\Users\\manoj\\IdeaProjects\\untitled\\src\\hellowaorldcom\\company\\hello.txt");
                String s="This is the content added to the file";
                byte b[]=s.getBytes();
                f.write(b);
                f.flush();
                f.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

