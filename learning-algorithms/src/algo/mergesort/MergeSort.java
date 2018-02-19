package algo.mergesort;

import java.util.Arrays;

public class MergeSort
{
    public static void sort(int inputArray[])
    {
        sort(inputArray, 0, inputArray.length - 1);
    }

    public static void sort(int inputArray[], int start, int end)
    {
        if (end <= start)
        {
            return;
        }
        int mid = (start + end) / 2;
        sort(inputArray, start, mid);
        sort(inputArray, mid + 1, end);
        merge(inputArray, start, mid, end);
    }

    public static void merge(int inputArray[], int start, int mid, int end)
    {
        int[] front = Arrays.copyOfRange(inputArray, 0, mid);
        int[] back = Arrays.copyOfRange(inputArray, mid + 1, end);
    }
}
