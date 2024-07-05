package Step03_Arrays.Prep03_Hard;

import java.util.ArrayList;
import java.util.List;

public class P01_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> triangle = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    triangle.add(1);
                }
                else{
                    int temp = pascalTriangle.get(i-1).get(j-1) + pascalTriangle.get(i-1).get(j);
                    triangle.add(temp);
                }
            }
            pascalTriangle.add(triangle);
        }
        return pascalTriangle;
    }
}

/*
118. Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]

Constraints:
1 <= numRows <= 30
 */