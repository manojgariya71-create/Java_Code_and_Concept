package hellowaorldcom.company;

class hel1{
    void display(){
        System.out.println("parent class");
    }
}
public class Hel extends hel1{
    void display(){
        System.out.println("child class");
    }
    public static void main(String args[]){
        Hel n=new Hel();
        hel1 m=new hel1();
        n.display();
        m.display();
    }
}
