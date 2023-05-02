class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        for (String part : s.split(" ")) {
            result.append(new StringBuilder(part).reverse() + " ");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }
}