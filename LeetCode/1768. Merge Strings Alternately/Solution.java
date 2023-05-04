    class Solution {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder result = new StringBuilder();
            int index1 = 0;
            int index2 = 0;
            int nextWord = 1;

            while (index1 + index2 < word1.length() + word2.length()) {
                if (nextWord++ % 2 == 1) {
                    if (word1.length() > index1) {
                        result.append(word1.charAt(index1++));
                    }
                } else {
                    if (word2.length() > index2) {
                        result.append(word2.charAt(index2++));
                    }
                System.out.println(result.toString());
                }
            }

            return result.toString();
        }
    }