import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            int currentToAdd = nums2[i];
            
            if (nums1[0] > currentToAdd || nums1[0] == 0) {
                shiftRight(nums1, 0);
                nums1[0] = currentToAdd;
                continue;
            }
            for (int j = 1; j < nums1.length; j++) {
                if (nums1[j] > currentToAdd || (nums1[j] == 0 && j >= nums1.length - n )) {
                    shiftRight(nums1, j);
                    nums1[j] = currentToAdd;
                    break;
                }
            }
        }
        
    }

    public void shiftRight(int[] array, int fromIndex) {
        if (array.length == 1) return;
        for (int i = array.length - 1; i >= fromIndex; i--) {
            if (i != 0) {
                array[i] = array[i - 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {0,0,0,0,0};
        int[] nums2 = new int[] {1,2,3,4,5};

        Solution sol = new Solution();
        sol.merge(nums1, 0, nums2, 5);

        System.out.println(Arrays.toString(nums1));
    }
}