import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] counters = new int[nums.length];
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            counters[num - 1]++;
        }

        for (int i = counters.length - 1; i >= 0; i--) {
            if (counters[i] == 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}