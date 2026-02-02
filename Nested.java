package hellowaorldcom.company;

public class Nested {
    static int i=10;
    static class two{
       static void msg(){
            System.out.println("Data"+" "+ i);
        }
    }
    public static void main(String args[]){
        Nested.two obj=new Nested.two();
        obj.msg();
        Nested.two.msg();
    }
}
