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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode curnt=temp;
        while( curnt.next !=null && curnt.next.next  !=null){
            ListNode first=curnt.next;
            ListNode secound=curnt.next.next;
            first.next=secound.next;
            curnt.next=secound;
            curnt.next.next=first;
            curnt=curnt.next.next;

        }
        return temp.next;
        
    }
}
