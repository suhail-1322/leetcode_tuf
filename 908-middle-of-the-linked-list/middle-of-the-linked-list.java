/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        
        ListNode slow = head;
        ListNode fast = head;
   
        while (fast!= null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
            }

        return slow;
    }
}
// int n = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             n++;
//             temp = temp.next;
//         }
     // if (n % 2 != 0) {
        //     while (fast.next != null) {
        //         slow = slow.next;
        //         fast = fast.next.next;
        //     }
        // }
        // else{
        //     while (fast!= null) {
        //         slow = slow.next;
        //         fast = fast.next.next;
        //     }
        // }
