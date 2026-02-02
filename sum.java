package hellowaorldcom.company;

public class sum {
    int a=50;
    int b=60;
    int c=30;
     void add(){
       int d=a+b+c;
         System.out.println("The sum is "+d);
     }
    public static void main(String[] args){
        sum obj=new sum();
        obj.add();
    }
}
