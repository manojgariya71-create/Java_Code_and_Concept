package hellowaorldcom.company;
class Father
{
    public void sample1(){
        System.out.println("The Father");
    }
}
class Son1 extends Father{
    public void sample(){
        System.out.println("The child 1");
    }
}
public class Son extends Father{
    public void sample2(){
        System.out.println("the second child");
    }
    public static void main(String args[]){
        Son s2=new Son();
        s2.sample2();
        s2.sample1();
        Son1 s1=new Son1();
        s1.sample();
        s1.sample1();
    }
}
