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
    public ListNode deleteDuplicates(ListNode head) {

        // Create a pointer to traverse the list
        ListNode current = head;

        // Traverse the list while there is a current node and a next node
        while (current != null && current.next != null) {
            // If the current node and the next node have the same value
            if (current.val == current.next.val) {
                // Skip the next node by linking current to the node after the next
                current.next = current.next.next;
            } else {
                // Otherwise, move on to the next node
                current = current.next;
            }
        }

        // Return the modified list starting from the head
        return head;
    }
}
