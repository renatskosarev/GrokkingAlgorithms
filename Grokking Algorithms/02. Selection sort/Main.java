import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 100, 91, 4, 132, 73, 19, 0, 404, 1 };
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {
        int minIndex;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
