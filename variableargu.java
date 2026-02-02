package hellowaorldcom.company;

public class variableargu {
    public int sum(int...args){
        System.out.println("arguments length"+args.length);
        int s=0;
        for(int x:args){
            s=s+x;
        }
        return s;
    }
    public static void main (String args[]){

        variableargu obj=new variableargu();
        int sum1=obj.sum(2,3);
        System.out.println("sum of 2 argument:- "+sum1);

        int sum2=obj.sum(2,4,3);
        System.out.println("sum of 3 argument:- "+sum2);

    }
}
