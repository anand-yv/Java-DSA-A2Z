package Step01_LearnTheBasics.Prep06_BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class P03_MaxFrequency {

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};
        int n = arr.length;

        Frequency(arr, n);
    }

    static void Frequency(int arr[], int n) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        int maxFrequency = 0, minFrequency = n;
        int maxElement = 0, minElement = 0;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFrequency) {
                maxElement = element;
                maxFrequency = count;
            }
            if (count < minFrequency) {
                minElement = element;
                minFrequency = count;
            }
        }

        System.out.println("The element with the highest frequency is: " + maxElement);
        System.out.println("The element with the lowest frequency is: " + minElement);
    }

}
