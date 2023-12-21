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
        ListNode curnt= head;
        while(curnt !=null && curnt.next !=null){
            if(curnt.next.val==curnt.val){
                curnt.next=curnt.next.next;
            }
            else{
                curnt=curnt.next;
            }
        }
        return head;
  
}
}
