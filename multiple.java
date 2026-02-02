package hellowaorldcom.company;
class hero{
private int i=10;
public void hello(){
    int m;
    m=i+11;
    System.out.println("the value in private is:"+i +"The value inside method is:"+m);
}
}
public class multiple {
    int a=10;
    multiple(){
        System.out.println("Default Constructor"+a);
    }
    multiple(int a,String b){
        System.out.println("peramterized constructor"+a);
        System.out.println("the string is "+b);
    }
    public static void main(String args[]){
        multiple obj=new multiple();
        multiple obj1=new multiple(120,"hello");
        hero obj2=new hero();
        obj2.hello();
    }
}
