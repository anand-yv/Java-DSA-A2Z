package Step03_Arrays.Prep01_Easy;

public class P03_CheckIfSortedArray {
    public static void main(String[] args) {
        int[] arr0 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("Arr 0 : " + checkIfArrayIsSorted(arr0)); // Output: true

        int[] arr1 = new int[]{1, 3, 2, 4, 5, 6};
        System.out.println("Arr 1 : " + checkIfArrayIsSorted(arr1)); // Output: false

        int[] arr2 = new int[]{6, 5, 4, 3, 2, 1};
        System.out.println("Arr 2 : " + checkIfArrayIsSorted(arr2)); // Output: false

        int[] arr3 = new int[]{1, 1, 1, 1, 1, 1};
        System.out.println("Arr 3 : " + checkIfArrayIsSorted(arr3)); // Output: true

        int[] arr4 = new int[]{1};
        System.out.println("Arr 4 : " + checkIfArrayIsSorted(arr4)); // Output: true

        int[] arr5 = new int[]{};
        System.out.println("Arr 5 : " + checkIfArrayIsSorted(arr5)); // Output: true (empty array is considered sorted)
    }

    private static boolean checkIfArrayIsSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
