class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) return true;
        int currentIndex = 0;

        for (char ch : t.toCharArray()) {
            if (ch == s.charAt(currentIndex)) {
                currentIndex++;
                if (currentIndex == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}