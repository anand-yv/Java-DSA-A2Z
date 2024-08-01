package Step04_BinarySearch.Prep02_BSonAns;

/*
{[2, 3, 45], [4, 6, 7, 8], 4 }
2 3 4 6 7 8 45
0 1 2 3 4 5  6

 */


public class P14_KthElementSortedArray {

    public long kthElement(int arr1[], int arr2[], int k) {
        int n1 = arr1.length, n2 = arr2.length;
        if(n1 > n2) return kthElement(arr2, arr1, k);
        int low = Math.max(0, k - n2), high = Math.min(n1, k);
        int left = k;
        while(low <= high){
            int mid1 = low + (high - low)/2;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if(mid1 < n1) r1 = arr1[mid1];
            if(mid2 < n2) r2 = arr2[mid2];
            if(mid1 - 1 >= 0) l1 = arr1[mid1-1];
            if(mid2 - 1 >= 0) l2 = arr2[mid2-1];
            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1, l2);
            }
            else if(l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }

    public static long kthElementBrute(int[] arr1, int[] arr2, int k){
        int n1 = arr1.length, n2 = arr2.length;
        if(n1 + n2 < k) return 0;
        int i = 0, j = 0;
        int ele = 0;
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                ele = arr1[i];
                i++;
            }
            else{
                ele = arr2[j];
                j++;
            }
            k--;
            if(k == 0) return ele;
        }
        if(k != 0){
            if(i < n1){
                 return arr1[i - k -1];
            }
            else{
                return arr2[j - k -1];
            }
        }
        return 0;
    }

}
