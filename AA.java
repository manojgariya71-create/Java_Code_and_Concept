package hellowaorldcom.company;

public class AA {
   int n;

    AA(int n){
        this.n=n;
    }
    void display(){
        System.out.println("the value of n"+n);
    }
    public static void main(String args []){
    AA a=new AA(8);
    a.display();
    }
}
