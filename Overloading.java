package hellowaorldcom.company;

public class Overloading {
    double area(double r){
        double x;
        x=3.14*r*r;
        return x;
    }
    int area(int m , int n){
        int z;
        z=m*n;
        return z;
    }
    public static void main(String[] args){
        Overloading obj = new Overloading();
        double y;
        y=obj.area(2.1);
        System.out.println(y);
        int a;
        a=obj.area(10,5);
        System.out.println(a);


    }
}
