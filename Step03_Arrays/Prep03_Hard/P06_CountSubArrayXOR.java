package Step03_Arrays.Prep03_Hard;

import java.util.HashMap;
import java.util.Map;

public class P06_CountSubArrayXOR {
    public int solve(int[] nums, int target) {
        Map<Integer, Integer> prefXor = new HashMap<>();
        prefXor.put(0,1);
        int xor = 0;
        int countSub = 0;
        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];

            int rem = xor ^ target;
            if(prefXor.containsKey(rem)){
                countSub += prefXor.get(rem);
            }
            prefXor.put(xor, prefXor.getOrDefault(xor, 0) + 1);
        }
        return countSub;
    }
}

/*

 */
