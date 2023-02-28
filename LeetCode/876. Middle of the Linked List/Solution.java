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
    public ListNode middleNode(ListNode head) {
        int nodeCount = 1;
        
        ListNode currentNode = head;
        while (currentNode.next != null) {
            nodeCount++;
            currentNode = currentNode.next;
        }

        for (int i = 0; i < nodeCount / 2; i++) {
            head = head.next;
        }

        return head;
    }
}