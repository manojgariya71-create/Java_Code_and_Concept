package hellowaorldcom.company;

public class oper {
    int x;
    public int maan(int x){
        this.x=x;
        return x;
    }
    public static void main(String args[]){
        oper n=new oper();
        int c=n.maan(1);
        System.out.println(c);
        System.out.println(n.x);

    }
}
