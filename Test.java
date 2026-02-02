package hellowaorldcom.company;
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
}
public class Test {
    public static void main(String args[]){
        MyThread n=new MyThread();
        n.start();

    }
}
