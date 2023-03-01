import java.util.Map;
import java.util.HashMap;

public class Solution {
    Map<Character, Integer> romanNumbers = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int result = 0;
        int last = 0;
        int preresult = 0;

        int current;
        for (char ch: s.toCharArray()) {
            current = romanNumbers.get(ch);
            if (current > last) {
                result += current - preresult;
                // result += current;
                preresult = 0;
            } else if (current <= last) {
                result += current + preresult;
                preresult = 0;
            } else {
                preresult += current;
            }
            last = current;
        }
        
        return result + preresult;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("III"));
        System.out.println(sol.romanToInt("LVIII"));
        System.out.println(sol.romanToInt("MCMXCIV"));
    }
}
