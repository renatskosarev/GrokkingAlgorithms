class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        int[] save = new int[k];
        for (int i = 0; i < k; i++) {
            save[i] = nums[nums.length - 1 - i];
        }

        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = save[save.length - 1 - i];
        }
    }
}