package hellowaorldcom.company;

public class commmandline {
    public static void main(String args[]){
        if(args.length>0){
            System.out.println("the command line arguments are");
            for(String v:args)
                System.out.println(v);
        }else
            System.out.println("no arguments passed");
    }
}
