package algo.quicksort;

public class App {
    public static void main(String[] args) {
        int[] inputArray = {9,7,3,1,6,3,2,6,8,9,2,3,0};
        QuickSort.quickSort(inputArray, 0, inputArray.length - 1);

        for (int i: inputArray) {
            System.out.println(i);
        }
    }
}
