package Step03_Arrays.Prep02_Medium;

import java.util.ArrayList;
import java.util.List;

public class P13_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left = 0, right = matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;
        while((left <= right) && (top <= bottom)){

            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top += 1;

            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right -= 1;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom -= 1;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }
                left += 1;
            }
        }
        return list;
    }
}


/*
54. Spiral Matrix
Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100

 */