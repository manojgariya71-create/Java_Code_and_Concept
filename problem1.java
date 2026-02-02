package hellowaorldcom.company;

public class problem1 {
    public static void main(String args[]){
        try{
           int [] mn={1,2,3,4};
            System.out.println("Hello");
            System.out.println(mn[5]);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally");
        }
    }
}
