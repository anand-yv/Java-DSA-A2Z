package Step02_SortingTechniques.Prep01_Sorting1;

import java.util.Arrays;

public class P01_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 422, 55, 66, 44, 10, 5};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting :  " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[min] > arr[j]) min = j;
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
