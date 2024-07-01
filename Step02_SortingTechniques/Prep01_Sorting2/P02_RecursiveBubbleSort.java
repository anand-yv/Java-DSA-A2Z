package Step02_SortingTechniques.Prep01_Sorting2;

import java.util.Arrays;

public class P02_RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 422, 55, 66, 44, 10, 5};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        recursiveBubbleSort(arr, arr.length);
        System.out.println("After Sorting :  " + Arrays.toString(arr));
    }


    private static void recursiveBubbleSort(int[] arr, int n){
        if(n == 1) return;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        recursiveBubbleSort(arr, n-1);
    }


}
