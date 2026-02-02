package hellowaorldcom.company;

public class recur {
    public int fact(int n){
        int f=1;
        if(n==1){
            return 1;
        }else{
         f=n*fact(n-1);
         return f;
        }
    }
    public static void main(String args[]){
        recur f=new recur();
        int m;
        m=f.fact(5);
        System.out.println(m);
    }
}
