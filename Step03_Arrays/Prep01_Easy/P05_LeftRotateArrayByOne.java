package Step03_Arrays.Prep01_Easy;

import java.util.Arrays;

public class P05_LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr0 = new int[]{1, 2, 3, 4, 5};
        rotate(arr0);
        System.out.println("Arr 0 : " + Arrays.toString(arr0)); // Output: [5, 1, 2, 3, 4]

        int[] arr1 = new int[]{1};
        rotate(arr1);
        System.out.println("Arr 1 : " + Arrays.toString(arr1)); // Output: [1]

        int[] arr2 = new int[]{1, 2};
        rotate(arr2);
        System.out.println("Arr 2 : " + Arrays.toString(arr2)); // Output: [2, 1]

        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6};
        rotate(arr3);
        System.out.println("Arr 3 : " + Arrays.toString(arr3)); // Output: [6, 1, 2, 3, 4, 5]

        int[] arr4 = new int[]{};
        rotate(arr4);
        System.out.println("Arr 4 : " + Arrays.toString(arr4)); // Output: []
    }

    private static void rotate(int[] arr) {
        if(arr.length == 0) return;
        // Left Rotate
//        int temp = arr[0];
//        for(int i = 1;  i < arr.length; i++){
//            arr[i-1] = arr[i];
//        }
//        arr[arr.length - 1] = temp;

        // Right Rotate
        int n = arr.length;
        int temp = arr[n-1];
        for(int i = n-2; i >=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }


}
