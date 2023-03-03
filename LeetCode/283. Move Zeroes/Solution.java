class Solution {
    public void moveZeroes(int[] nums) {
        boolean notEnd = false;
        for (int i = 0; i < nums.length - 1; i++) {
            
            for (int j = i; j < nums.length; j++) {
                if (nums[j] != 0) {
                    notEnd = true;
                    break;
                }
            }

            while (nums[i] == 0 && notEnd) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
            }

            notEnd = false;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = new int[] {0, 0, 1};
        sol.moveZeroes(arr);
        
        for (int n : arr) {
            System.out.println(n + " ");
        }
    }
}