import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> chars1 = ransomNote.chars().mapToObj(x -> (char) x).collect(Collectors.toList());
        List<Character> chars2 = magazine.chars().mapToObj(x -> (char) x).collect(Collectors.toList());
        
        List<Integer> usedIndexes = new ArrayList<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < magazine.length(); j++) {
                if (chars1.get(i).equals(chars2.get(j)) && !flag && !usedIndexes.contains(j)) {
                    flag = true;
                    usedIndexes.add(j);
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}