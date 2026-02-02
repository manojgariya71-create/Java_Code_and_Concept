package hellowaorldcom.company;
class Hello3 {
    int m=20;
    int n=10;
    public void display(){
        int c=m+n;
        System.out.println("the parent class"+c);
    }
}
public class Hello2 extends Hello3{
    public void displaychild(){
        System.out.println("The child class");
    }

    public static void main(String [] args){
        Hello3 h3=new Hello3();
        h3.display();
        Hello2 h2=new Hello2();
        h2.displaychild();
        h2.display();
    }
}
