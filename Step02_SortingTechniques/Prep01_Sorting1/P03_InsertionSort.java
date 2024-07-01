package Step02_SortingTechniques.Prep01_Sorting1;

import java.util.Arrays;

public class P03_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 422, 55, 66, 44, 10, 5};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting :  " + Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            while(i > 0 && arr[i] < arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            }
        }
    }
}
