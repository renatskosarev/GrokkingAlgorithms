import java.util.Arrays;

class Solution {
    public int findMiddleIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (Arrays.stream(nums, 0, i).sum() == Arrays.stream(nums, i + 1, nums.length).sum()) {
                return i;
            }
        }
        return -1;
    }
}