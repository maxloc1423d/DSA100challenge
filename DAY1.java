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
        ListNode d_head=new ListNode(0);
        ListNode l3=d_head;

        int carry=0;
        while(l1 !=null||l2 !=null){
            int valul1=(l1!=null) ? l1.val :0;
            int valul2=(l2!=null) ? l2.val :0;
            int currntsum=valul1+valul2+carry;
            carry=currntsum/10;
            int lastdigit=currntsum%10;
            ListNode new_node=new ListNode(lastdigit);
            l3.next=new_node;
            if(l1 !=null)l1=l1.next;
              if(l2 !=null)l2=l2.next;
              l3=l3.next;
        }
        if(carry>0){
            ListNode abc=new ListNode(carry);
            l3.next=abc;
            l3=l3.next;
        }
        return d_head.next;
        
    }
}
