package Step03_Arrays.Prep03_Hard;

public class P08_FindMissingRepeating {
    public int[] findTwoElement(int[] nums, int n) {
        // code here
        long sn = ((long) n * (n + 1)) / 2;
        long s2n = ((long) n * (n + 1) * (2L * n + 1)) / 6;
        long s1 = 0, s2 = 0;
        for (int num : nums) {
            s1 += num;
            s2 += ((long) num * num);
        }

        long val1 = s1 - sn;
        long val2 = s2 - s2n;
        val2 = val2 / val1;
        long missing = (val1 + val2) / 2;
        long repeating = missing - val1;
        return new int[]{(int) missing, (int) repeating};
    }
}
