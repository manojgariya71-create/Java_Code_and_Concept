package hellowaorldcom.company;

public class problem2 {
    static void check(int a){
        if(a<18){
            throw new ArithmeticException("Access Denied");
        }else{
            System.out.println("Access Granted");
        }
    }
    public static void main(String args[]){
        check(5);

    }
}
