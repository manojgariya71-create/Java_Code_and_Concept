package hellowaorldcom.company;

public class str{
    public static void main(String args[]){
        String s="Manoj Singh";
        System.out.println("the length of a string is "+s.length());
        int i=0;
        for(char c:s.toCharArray()){
            i++;
        }
        System.out.println("the value of string is "+i);
    }

}
