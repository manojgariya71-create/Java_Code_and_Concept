package hellowaorldcom.company;
class C
{
    int max=180;
}
class B extends C
{
    int max=100;
    void call(){
        System.out.println("The value is :"+super.max);
        System.out.println("the value is :"+max);
    }
}
public class A {
    public static void main(String [] args){
        B m=new B();
        m.call();
    }
}
