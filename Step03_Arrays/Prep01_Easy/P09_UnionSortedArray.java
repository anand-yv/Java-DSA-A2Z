package Step03_Arrays.Prep01_Easy;

import java.util.ArrayList;

public class P09_UnionSortedArray {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size()-1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size()-1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (union.size() == 0 || union.get(union.size()-1) != arr1[i]) {
                union.add(arr1[i]);

            }
            i++;
        }

        while (j < m) {
            if (union.size() == 0 || union.get(union.size()-1) != arr2[j]) union.add(arr2[j]);
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> result = findUnion(arr1, arr2, n, m);
        System.out.println("Union: " + result); // Output: Union: [1, 2, 3, 4, 5, 6, 7, 8]

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 3, 4, 5};
        n = arr3.length;
        m = arr4.length;
        result = findUnion(arr3, arr4, n, m);
        System.out.println("Union: " + result); // Output: Union: [1, 2, 3, 4, 5]

        int[] arr5 = {1, 2, 3, 4, 5};
        int[] arr6 = {};
        n = arr5.length;
        m = arr6.length;
        result = findUnion(arr5, arr6, n, m);
        System.out.println("Union: " + result); // Output: Union: [1, 2, 3, 4, 5]

        int[] arr7 = {};
        int[] arr8 = {4, 5, 6, 7, 8};
        n = arr7.length;
        m = arr8.length;
        result = findUnion(arr7, arr8, n, m);
        System.out.println("Union: " + result); // Output: Union: [4, 5, 6, 7, 8]

        int[] arr9 = {};
        int[] arr10 = {};
        n = arr9.length;
        m = arr10.length;
        result = findUnion(arr9, arr10, n, m);
        System.out.println("Union: " + result); // Output: Union: []
    }


}
