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
    public boolean hasCycle(ListNode head) {
        // HashSet<ListNode> set=new HashSet<>();
        // ListNode temp=head;
        // while(true){
        //     if(set.contains(temp)){
        //         return true;
        //     }
        //     set.add(temp);
        //     if(temp==null) return false;
        //     temp=temp.next;
            
        // }
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;slow=slow.next;
            if(fast==slow){
                return true;
            }
        }return false;
        
    }
}