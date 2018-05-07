package sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSort() {

        Random random = new Random();

        int[] arr = new int[100000000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000000000);
        }

        Helper.printArray(arr);

        long before = System.currentTimeMillis();

        QuickSort.quickSort(arr);

        long current = System.currentTimeMillis();

        long diff = current - before;

        System.out.println("Quick sort needed " + diff + "ms");
        Helper.printArray(arr);

        assertTrue(isSorted(arr));

    }

    @Test
    public void javaSort() {

        Random random = new Random();

        int[] arr = new int[100000000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000000000);
        }

        Helper.printArray(arr);

        long before = System.currentTimeMillis();

        Arrays.sort(arr);

        long current = System.currentTimeMillis();

        long diff = current - before;

        System.out.println("Quick sort needed " + diff + "ms");

        Helper.printArray(arr);

        assertTrue(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (!(arr[i] >= arr[i - 1])) {
                return false;
            }
        }
        return true;
    }

}