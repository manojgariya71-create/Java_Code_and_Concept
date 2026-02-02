package hellowaorldcom.company;

public class Binary {
    public int sum(int... args){
        System.out.println("argument length:"+args.length);
        int s=0;
        for(int x:args){
            s=s+x;
        }
        return s;
    }
    public static void main(String args[]) {
        Binary e= new Binary();
        int sum1=e.sum(2,4,4);
        System.out.println("sum with 2 arguments"+sum1);

    }
    }

