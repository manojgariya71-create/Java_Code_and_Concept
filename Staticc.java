package hellowaorldcom.company;

public class Staticc {
    int a;
    Staticc(){
        System.out.println("Default Constructor");
    }
    Staticc(int a){
//    this.a=a;
    this();
        System.out.println(a);
    }
    void add(){
       int c=a+a;
        System.out.println(c);
    }
    void display(){
        this.add();
    }
    public static void main(String args[]){
        Staticc n=new Staticc(12);
        n.display();

    }
}
