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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify the process
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Merge the two lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // Attach list1 node
                list1 = list1.next;  // Move to the next node in list1
            } else {
                current.next = list2; // Attach list2 node
                list2 = list2.next;  // Move to the next node in list2
            }
            current = current.next; // Move the current pointer
        }

        // Attach the remaining nodes from either list1 or list2
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list, starting from the first real node
        return dummy.next;
    }
}
