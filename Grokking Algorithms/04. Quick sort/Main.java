import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public int[] sortArray(int[] nums) {
        if (nums.length < 2)
            return nums;
        int pivot = nums[0];

        int[] less = sortArray(Arrays.stream(nums).skip(1).filter(x -> x <= pivot).toArray());
        int[] high = sortArray(Arrays.stream(nums).skip(1).filter(x -> x > pivot).toArray());

        List<Integer> resultList = new ArrayList<>();

        for (int num : less) {
            resultList.add(num);
        }
        resultList.add(pivot);
        for (int num : high) {
            resultList.add(num);
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}