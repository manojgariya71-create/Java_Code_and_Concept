package hellowaorldcom.company;
interface W{
    void display();
}
interface Y extends W {
    void method();
}
class X implements Y,W{
    public void method(){
        System.out.println("Interface overridden");
    }
    public void display(){
        System.out.println("Multi Interface");
    }
}
public class Z {
    public static void main(String args[]){

    }
}
