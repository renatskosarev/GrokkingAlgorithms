import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final char[] VOWELS = new char[] { 'a', 'e', 'i', 'o', 'u' };

    public String reverseVowels(String s) {
        List<Integer> vowelIndexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelIndexes.add(i);
            }
        }

        StringBuilder res = new StringBuilder(s);
        for (int i = 0; i < vowelIndexes.size() / 2; i++) {
            res.setCharAt(vowelIndexes.get(i), s.charAt(vowelIndexes.get(vowelIndexes.size() - i - 1)));
            res.setCharAt(vowelIndexes.get(vowelIndexes.size() - i - 1), s.charAt(vowelIndexes.get(i)));
        }

        return res.toString();
    }

    private static boolean isVowel(char ch) {
        for (char vowel : VOWELS) {
            if ((ch + "").toLowerCase().equals(vowel + "")) {
                return true;

            }
        }
        return false;
    }
}