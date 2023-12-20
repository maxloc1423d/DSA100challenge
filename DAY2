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
        ListNode temp=new ListNode(0);
        ListNode crrnt=temp;
        while(list1 !=null&&list2 !=null){
            if(list1.val <list2.val){
                crrnt.next=list1;
                list1=list1.next;
            }
            else{
                crrnt.next=list2;
                list2=list2.next;
            }
            crrnt=crrnt.next;
        }
        if(list1 !=null){
            crrnt.next=list1;
            list1=list1.next;
        }
        if(list2 !=null){
            crrnt.next=list2;
            list2=list2.next;
        }
        return temp.next;
        
    }
}
