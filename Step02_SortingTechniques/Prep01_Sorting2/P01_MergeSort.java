package Step02_SortingTechniques.Prep01_Sorting2;

import java.util.Arrays;

public class P01_MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 422, 55, 66, 44, 10, 5};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After Sorting :  " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low  + 1];
        int ind = 0;
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[ind] = arr[left];
                left++;
            }
            else{
                temp[ind] = arr[right];
                right++;
            }
            ind++;
        }

        while(left <= mid){
            temp[ind++] = arr[left++];
        }

        while(right <= high){
            temp[ind++] = arr[right++];
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp[i - low];
        }
    }
}
