class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (sumOfSubarray(nums, 0, i) == sumOfSubarray(nums, i + 1, nums.length)) {
                return i;
            }
        }
        return -1;

    }

    public static int sumOfSubarray(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}