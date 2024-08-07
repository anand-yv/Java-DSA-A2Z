package Step04_BinarySearch.Prep03_BSon2D;

public class P05_MatrixMedian {
    public int median(int[][] matrix, int row, int col) {
        // code here
        int req = (row * col)/2;
        int low = smallestEle(matrix, row, col);
        int high = largestEle(matrix, row, col-1);
        while(low <= high){
            int mid = low + (high - low)/2;
            int countEle = numberOfElements(matrix, mid, row, col);
            if(countEle <= req)low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    private int numberOfElements(int[][] matrix, int target, int row, int col) {
        int countEle = 0;
        for(int i = 0; i < row; i++){
            countEle += upperBound(matrix[i], target, col);
        }
        return countEle;
    }

    private int upperBound(int[] arr, int target, int len) {
        int low = 0, high = len - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    private int largestEle(int[][] matrix, int row, int col) {
        int maxEle = -1;
        for(int i = 0; i < row; i++){
            maxEle = Math.max(maxEle, matrix[i][col]);
        }
        return maxEle;
    }

    private int smallestEle(int[][] matrix, int row, int col) {
        int minEle = Integer.MAX_VALUE;
        for(int i = 0; i < row; i++){
            minEle = Math.min(minEle, matrix[i][0]);
        }
        return minEle;
    }
}
