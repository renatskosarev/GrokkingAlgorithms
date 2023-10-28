class Solution {
    public String reverseWords(String s) {
        String[] substrs = s.trim().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = substrs.length - 1; i >= 0; i--) {
            if (substrs[i].length() > 0) {
                sb.append(substrs[i]);
                sb.append(" ");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}