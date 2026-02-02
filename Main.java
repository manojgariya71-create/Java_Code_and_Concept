package hellowaorldcom.company;

class Shape_{
    void display(){
        System.out.println("Overridding");
    }
}
class Shape_1 extends Shape_{
    void display(){
        System.out.println("Overriding success");
    }
}
public class Main {

    public static void main(String[] args) {
        Shape_ n=new Shape_1();
        n.display();
    }
}