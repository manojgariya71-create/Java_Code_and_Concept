package hellowaorldcom.company;
class D
{
    int x;
    D(int a)
    {
        x=a;
    }
}
class E extends D
{
    int y;
    E(int a, int b){
        super(a);
        y=b;
    }
    void print(){
        System.out.println("The value of a is :"+x+" "+"value of b is :"+y);
    }
}
public class A1 {
    public static void main(String [] args){
        E n=new E(5,10);
        n.print();
    }
}
