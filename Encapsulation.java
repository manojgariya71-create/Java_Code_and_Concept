package hellowaorldcom.company;

public class Encapsulation {
    private String name;
    public void setter(String n){
         this.name=n;
    }
    String getter(){

        return name;
    }
    public static void main(String args[]){
        Encapsulation n=new Encapsulation();
        n.setter("Manoj");
        System.out.println(n.getter());

    }
}
