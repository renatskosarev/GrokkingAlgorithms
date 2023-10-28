class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        while (str1.length() != str2.length()) {
            if (str1.length() < str2.length()) {
                String temp = str1;
                str1 = str2;
                str2 = temp;
            }

            str1 = str1.substring(0, str1.length() - str2.length());
        }

        if (str1.equals(str2)) {
            return str1;
        }
        return "";
    }
}
