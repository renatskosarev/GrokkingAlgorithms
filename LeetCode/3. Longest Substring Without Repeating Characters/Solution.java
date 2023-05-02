import java.util.List;
import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        int maxLength = 1;
        int currentLength = 0;
        
        List<Character> symbols = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!symbols.contains(s.charAt(j))) {
                    currentLength++;
                    symbols.add(s.charAt(j));
                } else {
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                    }
                    currentLength = 0;
                    symbols.clear();
                    break;
                }
            }
        }

        return maxLength;
    }
}