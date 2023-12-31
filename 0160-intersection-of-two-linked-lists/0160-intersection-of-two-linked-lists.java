/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // ListNode temp1=headA,temp2=headB;
        // while(temp1!=null){
        //     while(temp2!=null){
        //         if(temp1==temp2) return temp1;
        //         temp2=temp2.next;
        //     }temp1=temp1.next;temp2=headB;
        // }return temp1;
        Set<ListNode> set=new HashSet<>();
        while(headA!=null){
            set.add(headA);headA=headA.next;
        }
        while(headB!=null){
            if(set.contains(headB)) return headB;
            else{
                set.add(headB);
                headB=headB.next;
            }
        }
       
        return null;
        
    }
}