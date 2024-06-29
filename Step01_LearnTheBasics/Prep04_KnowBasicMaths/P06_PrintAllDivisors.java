package Step01_LearnTheBasics.Prep04_KnowBasicMaths;

import java.util.ArrayList;
import java.util.List;

/*
Print All Divisors
 */


public class P06_PrintAllDivisors {
    public static List<Integer> findDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtN; ++i) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }
}
