package hellowaorldcom.company;
import java.util.Arrays;
public class compare {
    public static void main(String args[]){
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int[] arr3={5,4,3,2,1};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr2,arr3));
    }
}
