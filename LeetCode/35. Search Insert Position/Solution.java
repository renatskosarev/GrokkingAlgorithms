class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target == 0 && nums[0] > 0)
            return 0;

        int low = 0;
        int high = nums.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (low == high && nums[mid] < target) {
                return mid + 1;
            } else if (low == high && nums[mid] > target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}