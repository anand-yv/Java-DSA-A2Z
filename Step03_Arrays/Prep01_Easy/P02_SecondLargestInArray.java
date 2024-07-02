package Step03_Arrays.Prep01_Easy;

// Second-Largest Element in an Array without sorting
/*

 */

public class P02_SecondLargestInArray {
    public int print2largest(int arr[], int n) {
        // code here
        int largest = -1;
        int second_largest = -1;
        for(int i: arr){
            if(largest < i){
                second_largest = largest;
                largest = i;
            }
            else if(second_largest < i && i != largest){
                second_largest = i;
            }
        }
        return second_largest;
    }
}
