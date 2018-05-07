package sorting;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;


public class HelperTest {

    @Test
    public void test_printArr() {

        Random random = new Random();

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        Helper.printArray(arr);


    }


}