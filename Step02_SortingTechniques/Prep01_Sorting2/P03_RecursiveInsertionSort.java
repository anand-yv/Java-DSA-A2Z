package Step02_SortingTechniques.Prep01_Sorting2;

import java.util.Arrays;

public class P03_RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 422, 55, 66, 44, 10, 5};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        recursiveInsertionSort(arr, 0, arr.length);
        System.out.println("After Sorting :  " + Arrays.toString(arr));
    }

    private static void recursiveInsertionSort(int[] arr, int ind, int n) {
        if (ind == n) return;
        int i = ind;
        while (i > 0 && arr[i] < arr[i - 1]) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
            i--;
        }
        recursiveInsertionSort(arr, ind+1, n);
    }
}
