package hellowaorldcom.company;
abstract class BB1
{
    abstract void method();
        }
        class BB2 extends BB1
        {
            void method()
            {
                System.out.println("calling abstract class method");
            }
        }
public class AA1 {

    public static void main(String args[]){
        BB2 b=new BB2();
        b.method();

    }
}
