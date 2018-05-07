package sorting;

public class Helper {

    public static void printArray(int[] arr) {

        System.out.print("[");

        for (int i = 0; i < arr.length - 1; i++) {
            if (i >= 49) {
                System.out.print(arr[i] + ", ... ,");
                break;
            }
            System.out.print(arr[i] + ", ");
        }

        if (arr.length > 0) {
            System.out.print(arr[arr.length - 1]);
        }

        System.out.println("]");


    }


}
