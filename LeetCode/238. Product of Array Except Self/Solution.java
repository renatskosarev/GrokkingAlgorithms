class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productNumbersLeft = new int[nums.length];
        productNumbersLeft[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            productNumbersLeft[i] = productNumbersLeft[i - 1] * nums[i - 1];
        }

        int[] result = new int[nums.length];
        int currentRightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = productNumbersLeft[i] * currentRightProduct;
            currentRightProduct *= nums[i];
        }

        return result;
    }
}
