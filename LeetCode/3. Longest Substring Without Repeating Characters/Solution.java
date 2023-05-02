import java.util.List;
import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int currentLength = 0;
        List<Character> symbols = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (symbols.contains(c)) {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 0;
                symbols.clear();
            } else {
                symbols.add(c);
                currentLength++;
            }

        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));
    }
}