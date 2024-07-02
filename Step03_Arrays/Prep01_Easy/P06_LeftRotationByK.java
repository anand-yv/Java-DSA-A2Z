package Step03_Arrays.Prep01_Easy;

import java.util.Arrays;

public class P06_LeftRotationByK {
    public static void rightRotate(int[] nums, int k) {
        if(nums.length == 0) return;
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public static void reverse(int nums[], int start, int end){
        while(start <= end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr0 = new int[]{1, 2, 3, 4, 5};
        rightRotate(arr0, 1);
        System.out.println("Arr 0 : " + Arrays.toString(arr0)); // Output: [5, 1, 2, 3, 4]

        int[] arr1 = new int[]{1};
        rightRotate(arr1, 1);
        System.out.println("Arr 1 : " + Arrays.toString(arr1)); // Output: [1]

        int[] arr2 = new int[]{};
        rightRotate(arr2, 1);
        System.out.println("Arr 2 : " + Arrays.toString(arr2)); // Output: []

        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        rightRotate(arr3, 3);
        System.out.println("Arr 3 : " + Arrays.toString(arr3)); // Output: [3, 4, 5, 1, 2]

        int[] arr4 = new int[]{1, 2, 3, 4, 5};
        rightRotate(arr4, 5);
        System.out.println("Arr 4 : " + Arrays.toString(arr4)); // Output: [1, 2, 3, 4, 5]

        int[] arr5 = new int[]{1, 2, 3, 4, 5};
        rightRotate(arr5, 7);
        System.out.println("Arr 5 : " + Arrays.toString(arr5)); // Output: [3, 4, 5, 1, 2]

        int[] arr6 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        rightRotate(arr6, 3);
        System.out.println("Arr 6 : " + Arrays.toString(arr6)); // Output: [8, 9, 10, 1, 2, 3, 4, 5, 6, 7]

        int[] arr7 = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        rightRotate(arr7, 7);
        System.out.println("Arr 7 : " + Arrays.toString(arr7)); // Output: [30, 40, 50, 60, 70, 80, 90, 100, 10, 20]

        int[] arr8 = new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        rightRotate(arr8, 9);
        System.out.println("Arr 8 : " + Arrays.toString(arr8)); // Output: [15, 20, 25, 30, 35, 40, 45, 50, 5, 10]
    }

}
