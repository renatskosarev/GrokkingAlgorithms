import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int prev = -1;
        for (int num : nums) {
            if (num != prev + 1) {
                return prev + 1;
            } else {
                prev++;
            }
        }
        return prev + 1;
    }
}