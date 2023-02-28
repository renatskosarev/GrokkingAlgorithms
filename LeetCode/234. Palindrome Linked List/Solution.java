import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> nodes = new ArrayList<>();

        ListNode currentNode = head;
        while (currentNode.next != null) {
            nodes.add(currentNode.val);
            currentNode = currentNode.next;
        }
        nodes.add(currentNode.val);
        if (nodes.size() == 1)
            return true;
        for (int i = 0; i < nodes.size() / 2; i++) {
            if (nodes.get(i) != nodes.get(nodes.size() - 1 - i)) {
                return false;
            }
        }
        return true;   
    }
}