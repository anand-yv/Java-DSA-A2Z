package Step01_LearnTheBasics.Prep04_KnowBasicMaths;

public class P07_CheckPrime {
    static boolean checkPrime(int n) {
        int factorCount = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factorCount++;
                if (n / i != i) {
                    factorCount++;
                }
            }
        }
        return factorCount == 2;
    }

}
