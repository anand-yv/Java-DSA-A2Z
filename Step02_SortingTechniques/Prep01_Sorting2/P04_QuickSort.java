package Step02_SortingTechniques.Prep01_Sorting2;

import java.util.Arrays;

public class P04_QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 422, 55, 66, 44, 10, 5};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("After Sorting :  " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int pIndex = partition(arr, low, high);
        quickSort(arr, low, pIndex-1);
        quickSort(arr, pIndex+1, high);
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int left = low;
        int right = high;
        while(left < right){
            while(arr[left] <= pivot && left < high){
                left++;
            }
            while(arr[right] > pivot && right > low){
                right--;
            }
            if(left < right){
                swap(arr, left, right);
            }
        }
        swap(arr, low, right);
        return right;
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
