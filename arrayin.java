package hellowaorldcom.company;

public class arrayin {

    public static void main(String[] args) {

        int a[] = new int[]{2, 3, 4, 5, 6};
        System.out.println(a[4]);
        System.out.println("length of an array"+a.length);
        int i=0;
        while(i<a.length){
            System.out.println(a[i]);
            i++;
        }
    }
}