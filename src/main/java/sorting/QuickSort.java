package sorting;

public class QuickSort {

    public static void quickSort(int[] arr) {

        sort(arr,0, arr.length - 1);

    }

    private static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = arr[right];

        int smaller = left; //"kleiner" Pfeil
        int higher = right - 1; //"größer" Pfeil

        do {

            while (arr[smaller] <= pivot && smaller < right) {
                smaller++;
            }

            while (arr[higher] >= pivot && higher > 0) {
                higher--;
            }

            if (smaller < higher) {
                int temp = arr[smaller];

                arr[smaller] = arr[higher];
                arr[higher] = temp;
            }

        } while (smaller < higher);

        if (arr[smaller] > pivot) {
            //Switch both elements

            arr[right] = arr[smaller];
            arr[smaller] = pivot;
        }

        sort(arr,left, smaller - 1);
        sort(arr,smaller + 1, right);

    }

}
