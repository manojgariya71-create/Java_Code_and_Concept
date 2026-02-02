package hellowaorldcom.company;
class base
{
    public void base1(){
        System.out.println("parent class");
    }
}
class Child2 extends base{
    public void child2(){
        System.out.println("The 1 Child ");
    }
}
public class Child3 extends Child2  {
    public void child_3(){
        System.out.println("The 2 child ");
    }
    public static void main(String [] args){
        base b=new base();
        b.base1();
        Child2 c2=new Child2();
        c2.child2();
        c2.base1();
        Child3 c3=new Child3();
        c3.child_3();
        c3.child2();
        c3.base1();
    }
}
