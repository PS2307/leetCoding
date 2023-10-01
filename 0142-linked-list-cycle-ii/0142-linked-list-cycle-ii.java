/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode cur=head;
        ListNode temp=head;
        while(cur!=null && cur.next!=null){
            cur=cur.next.next;
            temp=temp.next;
            if(cur==temp){
                ListNode temp2=head;
                while(temp2!=temp){
                    temp=temp.next;
                    temp2=temp2.next;
                }return temp2;
            }
        }return null;
        
    }
}

