package hellowaorldcom.company;
class bike1{
    public void display(){
        System.out.println("bike 1 class");
    }
}
class bike extends bike1{
    public void display(){
        System.out.println("bike class");
    }
        }
public class Car {
    public static void main(String arg[]){
       bike1 n;
       n=new bike1();
       n.display();
       n=new bike();
       n.display();
    }
}
