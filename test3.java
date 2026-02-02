package hellowaorldcom.company;
class DemoSleep extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
public class test3 {
    public static void main(String args[]){
        new DemoSleep().start();

    }
}
