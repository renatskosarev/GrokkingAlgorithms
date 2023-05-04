class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            String current = words[i];
            if (current.trim().length() != 0) {
                result.append(current + " ");
            }
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }
}