package hellowaorldcom.company;

public class sumre {
    public int sum(int a){
        int s=1;
        if(a==1){
            return 1;
        }else{
            s=a+sum(a-1);
            return s;
        }

    }

    public static void main(String args[]){
        sumre v=new sumre();
        int m;
        m=v.sum(4);
        System.out.println(m);
    }
}
