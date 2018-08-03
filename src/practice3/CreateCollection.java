package practice3;

import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateCollection {

    private static ArrayList<String> someCollection;

    public static void main(String []args) {
        int[] arr = {2, 5, 7, 3};
        printSortedVersionOf(arr);
        listCollection(new Integer[] {0, 8, 6, 4, 7});

        if(someCollection == null) {
            throw new NullPointerException("Current collection is empty !!!");
        }
        }

     public static void printSortedVersionOf(int[]numbers) {
         Arrays.sort(numbers);
         System.out.println(Arrays.toString(numbers));
     }

    public static void listCollection (Integer []a) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        System.out.println(list);
    }


}