package hellowaorldcom.company;
interface Shape{
    void area(int a,int b);
}
interface Shape1{
    void area();
}
class Shape3{
    void display(){
        System.out.println("Class");
    }
}
class Shape2 extends Shape3 implements Shape,Shape1{
    public void area(int a,int b){
        int c=a+b;
        System.out.println("interface"+c);
    }
    public void area(){
        System.out.println("Shape 1" );
    }
}
public class Sample {
    public static void main(String args[]){
        Shape2 n=new Shape2();
        n.area(5,5);
        n.area();
        n.display();

    }
}
