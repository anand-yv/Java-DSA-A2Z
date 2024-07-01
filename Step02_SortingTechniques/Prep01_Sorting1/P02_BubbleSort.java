package Step02_SortingTechniques.Prep01_Sorting1;

import java.util.Arrays;

public class P02_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 422, 55, 66, 44, 10, 5};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting :  " + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            boolean check = true;
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = false;
                }
            }
            if(check) break;
        }
    }
}
