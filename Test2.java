package hellowaorldcom.company;
class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Running the program..");
    }
}
public class Test2 {
    public static void main(String args[]){
//        MyThread2 m=new MyThread2();
        Thread n=new Thread(new MyThread2());
        n.start();
    }
}
