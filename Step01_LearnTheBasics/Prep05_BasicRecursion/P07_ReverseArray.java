package Step01_LearnTheBasics.Prep05_BasicRecursion;

import java.util.Arrays;

public class P07_ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before Reversing : " + Arrays.toString(arr));
        reverseArray(arr, 0, arr.length-1);
        System.out.println("After Reversing  : " + Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int low, int high){
        if(low >= high) return;
        int temp = arr[low];
        arr[low++] = arr[high];
        arr[high--] = temp;
        reverseArray(arr, low, high);
    }
}
