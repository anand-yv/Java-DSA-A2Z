package Step03_Arrays.Prep01_Easy;

public class P08_LinearSearch {
    private static boolean linearSearch(int[] nums, int ele){
        for(int num: nums){
            if(num == ele) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr0 = new int[]{5, 2, 8, 12, 3};
        int ele0 = 8;
        boolean result0 = linearSearch(arr0, ele0);
        System.out.println("Element " + ele0 + " found: " + result0); // Output: Element 8 found: true

        int[] arr1 = new int[]{5, 2, 8, 12, 3};
        int ele1 = 6;
        boolean result1 = linearSearch(arr1, ele1);
        System.out.println("Element " + ele1 + " found: " + result1); // Output: Element 6 found: false

        int[] arr2 = new int[]{5, 2, 8, 12, 3};
        int ele2 = 5;
        boolean result2 = linearSearch(arr2, ele2);
        System.out.println("Element " + ele2 + " found: " + result2); // Output: Element 5 found: true

        int[] arr3 = new int[]{5, 2, 8, 12, 3};
        int ele3 = 3;
        boolean result3 = linearSearch(arr3, ele3);
        System.out.println("Element " + ele3 + " found: " + result3); // Output: Element 3 found: true

        int[] arr4 = new int[]{5, 2, 8, 12, 3};
        int ele4 = 12;
        boolean result4 = linearSearch(arr4, ele4);
        System.out.println("Element " + ele4 + " found: " + result4); // Output: Element 12 found: true

        int[] arr5 = new int[]{};
        int ele5 = 5;
        boolean result5 = linearSearch(arr5, ele5);
        System.out.println("Element " + ele5 + " found: " + result5); // Output: Element 5 found: false
    }
}
