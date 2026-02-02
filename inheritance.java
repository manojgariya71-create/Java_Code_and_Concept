package hellowaorldcom.company;
class second{
    int a;
    second(int x){
         a=x;
    }
}
public class inheritance extends second{
    int b;
    inheritance(int x,int y){
        super(x);
        b=y;
    }
    void show(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[]){
        inheritance n=new inheritance(10,20);
        n.show();
    }

}
