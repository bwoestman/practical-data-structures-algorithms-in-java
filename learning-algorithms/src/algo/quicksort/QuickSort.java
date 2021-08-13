package algo.quicksort;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pp = partition(arr, start, end);
        quickSort(arr, start, pp - 1);
        quickSort(arr, pp + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;

        return i;
    }
}
