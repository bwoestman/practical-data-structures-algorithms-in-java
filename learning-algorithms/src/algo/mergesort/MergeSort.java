package algo.mergesort;

public class MergeSort {
    public static void sort(int[] inputArray) {
        sort(inputArray, 0, inputArray.length - 1);
    }

    public static void sort(int[] inputArray, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;

        sort(inputArray, start, mid);
        sort(inputArray, mid + 1, end);

        merge(inputArray, start, mid, end);
    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int k = 0;

        int left = start;
        int right = mid + 1;

        while(left <= mid && right <= end) {
            if (inputArray[left] < inputArray[right]) {
                temp[k] = inputArray[left];
                left++;
            } else {
                temp[k] = inputArray[right];
                right++;;
            }
            k++;
        }

        while (left <= mid) {
            temp[k] = inputArray[left];
            left++;
            k++;
        }

        while (right <= end) {
            temp[k] = inputArray[right];
            right++;
            k++;
        }

        for (int j : temp) {
            inputArray[start] = j;
            start++;
        }
    }
}
