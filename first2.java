package hellowaorldcom.company;

import java.util.HashSet;

public class first2 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        System.out.println(cars);
    }
}
