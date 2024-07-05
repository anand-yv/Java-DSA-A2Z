package Step03_Arrays.Prep03_Hard;

import java.util.ArrayList;
import java.util.List;

public class P02_MajorityElement {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for (int j : nums) {
            if (count1 == 0 && ele2 != j) {
                ele1 = j;
                count1 += 1;
            } else if (count2 == 0 && ele1 != j) {
                ele2 = j;
                count2 += 1;
            } else if (ele1 == j) {
                count1 += 1;
            } else if (ele2 == j) {
                count2 += 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (ele1 == num) count1 += 1;
            else if (ele2 == num) count2 += 1;
        }

        int mini = nums.length / 3 + 1;
        if (count1 >= mini) res.add(ele1);
        if (count2 >= mini) res.add(ele2);
        return res;
    }
}
