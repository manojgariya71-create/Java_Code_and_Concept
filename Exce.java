package hellowaorldcom.company;

public class Exce {
    static void checkage(int age){
            if(age<18){
                throw new ArithmeticException("Must be 18+");
            }else{
                System.out.println("Access Granted");
            }
    }
    public static void main(String args[]){
        try {
            checkage(20);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
