package Step01_LearnTheBasics.Prep06_BasicHashing;

import java.util.HashMap;
import java.util.Map;

/*
Given an array arr[] of n positive integers which can contain integers from 1 to p where elements can be repeated or can be absent from the array.
Your task is to count the frequency of all numbers from 1 to n. Do modify the array in-place changes in arr[], such that arr[i] = frequency(i) and assume 1-based indexing.

Note: The elements greater than n in the array can be ignored for counting.

Examples

Input: n = 5 arr[] = {2, 3, 2, 3, 5} p = 5
Output: 0 2 2 0 1
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 2 times. 3 occurring 2 times. 4 occurring 0 times. 5 occurring 1 time.
Input: n = 4  arr[] = {3,3,3,3} p = 3
Output: 0 0 4 0
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 0 times. 3 occurring 4 times. 4 occurring 0 times.
Input: n = 2 arr[] = {8,9} p = 9
Output: 0 0
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 0 times. Since here P=9, but there are no 9th Index present so can't count the value.
Your Task:
You don't need to read input or print anything. Complete the function frequencyCount() that takes the array arr, and integers n, and p as input parameters and modify the array in-place to denote the frequency count of each element from 1 to N.

Expected time complexity: O(N)
Expected auxiliay space: O(1)

Constraints:
1 ≤ n ≤ 105
1 ≤ p ≤ 4*104
1 <= arr[i] <= p
 */


public class P02_FrequencyOfElements {
    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        Map<Integer, Integer> freqEle = new HashMap<>();
        for (int num : arr) {
            if (num <= N) {
                freqEle.put(num, freqEle.getOrDefault(num, 0) + 1);
            }
        }

        for (int i = 0; i < N; i++) {
            arr[i] = freqEle.getOrDefault(i + 1, 0);
        }
    }
}


