package hellowaorldcom.company;
class owenexception extends Exception{
    public owenexception(String s){
        super(s);
    }
}
public class except1 {
    public static void main(String [] args){
        try {
            throw new owenexception("User define ");
        }catch (owenexception e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}
