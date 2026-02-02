package hellowaorldcom.company;
interface Hello4
{
    public void method();
}
interface Hello5
{
    public void method1();
}
class man3 implements Hello4,Hello5
{
    public void method(){
            System.out.println("1 interface");
        }

       public void method1(){
            System.out.println("2 interface");
        }

}
public class AA3 {
    public static void main(String [] args){

        man3 m=new man3();
        m.method();
        m.method1();
    }
}
