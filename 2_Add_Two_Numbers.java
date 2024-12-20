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
        ListNode dummy = new ListNode(-1); // Dummy node to simplify list construction
        ListNode current = dummy; // Pointer to build the result list
        int carry = 0; // To keep track of carry

        // Traverse both lists until both are null
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0; // Get value from l1 or 0 if null
            int val2 = (l2 != null) ? l2.val : 0; // Get value from l2 or 0 if null

            int sum = val1 + val2 + carry; // Sum of the values and carry
            carry = sum / 10; // Update carry for next iteration
            int digit = sum % 10; // Current digit to store in the result list

            current.next = new ListNode(digit); // Add the digit to the result list
            current = current.next; // Move the pointer

            // Move to the next nodes in l1 and l2 if they exist
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next; // Return the head of the new list (skipping the dummy node)
    }
}
