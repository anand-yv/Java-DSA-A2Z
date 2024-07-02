package Step03_Arrays.Prep01_Easy;

import java.util.Arrays;

public class P07_MoveZeroToEnd {
    public static void moveZerosToEnd(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] == 0 && nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
            else if(nums[i] != 0){
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr0 = new int[]{0, 1, 0, 3, 12};
        moveZerosToEnd(arr0);
        System.out.println("Arr 0 : " + Arrays.toString(arr0)); // Output: [1, 3, 12, 0, 0]

        int[] arr1 = new int[]{0, 0, 0};
        moveZerosToEnd(arr1);
        System.out.println("Arr 1 : " + Arrays.toString(arr1)); // Output: [0, 0, 0]

        int[] arr2 = new int[]{1, 2, 3};
        moveZerosToEnd(arr2);
        System.out.println("Arr 2 : " + Arrays.toString(arr2)); // Output: [1, 2, 3]

        int[] arr3 = new int[]{0, 0, 0, 0, 0};
        moveZerosToEnd(arr3);
        System.out.println("Arr 3 : " + Arrays.toString(arr3)); // Output: [0, 0, 0, 0, 0]

        int[] arr4 = new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        moveZerosToEnd(arr4);
        System.out.println("Arr 4 : " + Arrays.toString(arr4)); // Output: [4, 2, 4, 3, 5, 1, 0, 0, 0, 0]
    }
}
