class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        char[] result = new char[word1.length() + word2.length()];
        int next = 0;
        
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length() ) {
                result[next++] = word1.charAt(i);
            }
            if (i < word2.length()) {
                result[next++] = word2.charAt(i);
            }
            i++;
        }

        return new String(result);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.mergeAlternately("hello", "world"));
        System.out.println(sol.mergeAlternately("a", "cccccc"));
        System.out.println(sol.mergeAlternately("", "cccccc"));
        System.out.println(sol.mergeAlternately("rererere", "nat"));
        System.out.println(sol.mergeAlternately("rudiment", ""));
    }
}