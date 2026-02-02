package hellowaorldcom.company;

public class Cons {
    int id;
    String name ="Rahul";
    Cons(int id ,String name){
        this.id=id;
        this.name=name;
    }
    void show(){
        System.out.println(id + name);
    }
    public static void main(String args[]){
        Cons n=new Cons(1,"Manoj");
        n.show();


    }
}
