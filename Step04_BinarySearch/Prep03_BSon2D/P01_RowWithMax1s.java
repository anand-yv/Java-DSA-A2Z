package Step04_BinarySearch.Prep03_BSon2D;

public class P01_RowWithMax1s {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int rowIndex = -1;
        int countMax1 = 0;
        for (int i = 0; i < arr.length; i++) {
            int count1 = arr[i].length - lowerBound(arr[i], 0, arr[i].length - 1);
            if (count1 > countMax1) {
                rowIndex = i;
                countMax1 = count1;
            }
        }
        return rowIndex;
    }

    private int lowerBound(int[] row, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] >= 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
