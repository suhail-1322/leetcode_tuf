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
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     
    //     ListNode temp = head;
    //     int len =0;
    //     while(temp!=null){
    //         len++;
    //         temp=temp.next;

    //     }
    //     if(len-n==0){
    //         return head.next;
    //     }
    //     else{
    //         int k=len-n;
    //         removeNode(head,k);
    //         return head;
    //     }
    // }
    // static ListNode removeNode(ListNode head,int n){

    //     ListNode temp = head;
    //     int count =0;

    //     while(temp!=null){
    //         count++;
    //         if(count==n){
    //             temp.next = temp.next.next;
    //         }
    //         temp=temp.next;

    //     }
    //     return head;
    
    // }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode fast=head;
        ListNode slow =head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}