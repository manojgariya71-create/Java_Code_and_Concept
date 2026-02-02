package hellowaorldcom.company;

public class inner{
    private int i=10;
    class first{
        void display(){
            System.out.println("Data"+" "+i);
        }
    }
    public static void main(String args[]){
        inner obj = new inner();
        inner.first in=obj.new first();
        in.display();
    }
}
