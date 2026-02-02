package hellowaorldcom.company;
class Class2{
    void display(){
        System.out.println("2 Class");
    }
}
public class MultiC {
    public static void main(String args[]){
        Class2 n=new Class2();
        n.display();

        int a=10;
        int b;
        b=(a==1)?20:40;
        System.out.println(b);
    }
}
