package hellowaorldcom.company;


interface man
{
   public void method();
}
interface man1 extends man
{
    public void method1();
}
class son implements man1
{
   public void method(){
        System.out.println("The 1 interface");
    }
   public void method1(){
        System.out.println("The 2 interface");
    }
}
public class AA2 {
    public static void main(String args[]){
        son m=new son();
        m.method();
        m.method1();
    }
}
