package hellowaorldcom.company;

import java.util.ArrayList;

public class List {
    public static void main(String args[]){
        ArrayList<String> n=new ArrayList<String>();
        //Inseration in Array List
        n.add("Manoj");
        n.add("rahul");
        n.add("Subham");
        System.out.println(n);
        //size of arraylist
        System.out.println(n.size());
        //remove 1 index element
        n.remove(1);
        System.out.println(n);
        //Update
        n.set(0,"mayank");
        System.out.println(n);
    }
}
