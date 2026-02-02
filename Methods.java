package hellowaorldcom.company;

public class Methods {
    public int add(int a, int b) {
        int x=a+b;
        return x;
    }
    public static void main(String args[]){
        Methods obj= new Methods();
        int m= 30;
        int n= 40;
        int y=obj.add(m,n);
        System.out.println("The value is " +y);

    }
}
