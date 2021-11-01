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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode cur =head;
      while(head!=null)
      {count++;
          head=head.next;
          
      }
        
        int pos =count/2;

        
    
        while(cur!=null&&pos>0)
        {
            
            cur=cur.next;
            pos--;
            
        }
        
        return cur;
    }
}