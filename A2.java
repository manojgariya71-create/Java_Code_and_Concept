package hellowaorldcom.company;
class C1
{
    void methods(){
        System.out.println("Hello world");
    }
}
class B1 extends C1
{
    void methods(){
        System.out.println("Welcome");
    }
    void print(){
        methods();
        super.methods();
    }
}
public class A2 {
    public static void main(String [] args){
        B1 n=new B1();
        n.print();

    }
}
