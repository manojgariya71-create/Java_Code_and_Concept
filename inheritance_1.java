package hellowaorldcom.company;
class hello_2{
    public void hello2(){
        System.out.println("grandfather");
    }
}
     class hello_1 extends hello_2{
    public void hello(){
        System.out.println("father");
    }
}
public class inheritance_1 extends hello_1 {
    public void man(){
        System.out.println("son");
    }

    public static void main(String args[]){
        inheritance_1 b=new inheritance_1();
        b.man();
        b.hello();
        b.hello2();
    }
}
