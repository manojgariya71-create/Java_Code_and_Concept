package hellowaorldcom.company;
class Parent
{
    void method(){
        System.out.println("Parent Class Method");
    }
}
class Child extends Parent
{
   void method(){
       System.out.println("Child Class Method");
   }
   void print(){
       method();
       super.method();
   }
}
public class Calling {
    public static void main(String args[]){
        Child ch=new Child();
        ch.print();
    }
}
