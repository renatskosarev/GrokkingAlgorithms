class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        
        int nodesCount = 1;
        ListNode currentNode = head;

        while (currentNode.next != null) {
            nodesCount++;
            currentNode = currentNode.next;
        }

        currentNode = head;
        for (int i = 1; i < nodesCount - n; i++) {
            currentNode = currentNode.next;
        }

        if (nodesCount == n) {
            return head.next;
        }

        currentNode.next = currentNode.next.next;
        return head;

    }
}