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
    public ListNode insertionSortList(ListNode head) {
        if(head ==null ||head.next==null){
            return head;
        }
        ListNode temp=head.next;
        ListNode sorted=head;
        while(temp !=null){
            if(temp.val >=sorted.val){
                sorted=temp;
                temp=temp.next;
                continue;
            }
            sorted.next=temp.next;
            
            ListNode prev=null;
            ListNode t1=head;
           while(t1 !=sorted.next) {
               if(t1.val >=temp.val){
                   break;
               }
               prev =t1;
               t1=t1.next;

            }
            if(prev ==null){
                temp.next=head;
                head=temp;
            }
            else{
                temp.next=prev.next;
                prev.next=temp;
            }
            temp=sorted.next;
            
        }  
        return head;
          }
}
