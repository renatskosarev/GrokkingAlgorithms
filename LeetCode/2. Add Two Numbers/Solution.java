import java.math.BigInteger;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        
        ListNode currentNode = l1;
        while (currentNode != null) {
            num1.append(currentNode.val);
            currentNode = currentNode.next;
        }
        currentNode = l2;
        while (currentNode != null) {
            num2.append(currentNode.val);
            currentNode = currentNode.next;
        }

        BigInteger sum = new BigInteger(num1.reverse().toString()).add(new BigInteger(num2.reverse().toString()));
        String result = sum.toString();

        
        ListNode head = new ListNode();
        ListNode pastNode = head;
        currentNode = head;

        for (char ch : new StringBuilder(result).reverse().toString().toCharArray()) {
            currentNode.val = Integer.parseInt("" + ch);
            currentNode.next = new ListNode();
            pastNode = currentNode;
            currentNode = currentNode.next;
        }
        pastNode.next = null;
        return head;
    }
}