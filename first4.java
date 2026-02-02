package hellowaorldcom.company;

public class first4 {
    public static void main(String args[]){
        String str="Hello_World";
        char []str2={'h','e','l','l','o'};
        String str3=new String(str2);
        String str4=new String("HELLO");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str.length());
        System.out.println(str+str3);
        System.out.println(str.concat(str4));
        System.out.println(str.charAt(2));
        System.out.println(str3.toUpperCase());
        System.out.println(str4.toLowerCase());
        System.out.println(str.substring(0,3));
        System.out.println(str.compareTo(str3));

    }
}
