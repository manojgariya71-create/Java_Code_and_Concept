package hellowaorldcom.company;

public class perameterized {
    int age;
    String s;
    public perameterized(int b, String j){
        age=b;
        s=j;
        System.out.println("the age is"+age);
        System.out.println("the name is "+s);
    }

    public static void main(String [] args){
perameterized obj= new perameterized(16,"Sachin");
perameterized obj1=new perameterized(55,"aman");

    }
}
