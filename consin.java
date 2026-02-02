package hellowaorldcom.company;
class parent{
    int x;
    parent(int a){
         x=a;
        System.out.println("parent constructor");
    }
}
class child extends parent{
    int y;
    child(int a,int b){
        super(a);
        y=b;
    }
    void show(){
        System.out.println("show the value of x is :"+x +"and y is :"+y);
    }
}
public class consin {
    public static void main(String [] args){
        child sc=new child(1,4);
        sc.show();
    }
}
