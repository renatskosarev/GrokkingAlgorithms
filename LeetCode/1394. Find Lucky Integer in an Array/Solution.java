public class Solution {
    public int findLucky(int[] arr) {
        int[] counters = new int[500];

        for (int i : arr) {
            counters[i - 1]++;
        }
        for (int i = counters.length - 1; i > 0; i--) {
            if (i == counters[i - 1]) {
                return i;
            }
        }

        return -1;
    }
}
