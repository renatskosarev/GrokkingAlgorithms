import java.util.Arrays;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = getWeakestIndex(mat);
            mat[result[i]] = new int[]{100000000};
        }

        return result;
    }

    private int getWeakestIndex(int[][] mat) {
        int[] points = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            points[i] = Arrays.stream(mat[i]).sum();
        }
        int min = Arrays.stream(points).min().getAsInt();
        for (int i = 0; i < mat.length; i++) {
            if (Arrays.stream(mat[i]).sum() == min) {
                return i;
            }
        }
        return -1;
    }
}