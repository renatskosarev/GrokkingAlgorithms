class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] + numbers[numbers.length - 1] < target) {
                continue;
            }
            for (int j = numbers.length - 1; j >= 0; j--) {
                if (i != j && numbers[i] + numbers[j] == target) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }

        return new int[] {numbers.length, numbers.length};
    }
}