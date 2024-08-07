package Step04_BinarySearch.Prep03_BSon2D;

public class P04_FindPeakElementII {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat[0].length - 1;
        int low = 0, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = maxRowInd(mat, mid);
            int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
            int right = mid + 1 <= m ? mat[row][mid + 1] : -1;
            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[]{row, mid};
            } else if (mat[row][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    private int maxRowInd(int[][] mat, int col) {
        int maxInd = -1;
        int maxEle = -1;
        for (int i = 0; i < mat.length; i++) {
            if (maxEle < mat[i][col]) {
                maxInd = i;
                maxEle = mat[i][col];
            }
        }
        return maxInd;
    }
}
