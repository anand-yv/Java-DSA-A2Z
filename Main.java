import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 7;
        long multiplier = 1;
        long res = 0;
        while (n > 0) {
            res += (n ^ (n - 1)) * multiplier;
            multiplier *= -1;
            n &= (n - 1);
        }
        System.out.println(Math.abs(res));
    }
}
