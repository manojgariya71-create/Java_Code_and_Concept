package hellowaorldcom.company;
import java.util.*;

public class first6 {

    public int max(int arr[]) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        return m;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Array size must be greater than 0");
            return;
        }

        int[] arr = new int[a];

        System.out.println("Enter element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        first6 n = new first6();
        int d = n.max(arr);
        System.out.println("Maximum element = " + d);
    }
}

