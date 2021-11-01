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
    public int jj(ListNode head)
{
	int count=0;
while(head!=null)
{
	count++;
	
	head=head.next;
	
}return count;
}
    
    public ListNode removeNthFromEnd(ListNode head, int n1) {
        
		int x=jj(head);
		int n=x-n1+1;
    ListNode prev=null;
        ListNode first=head;

         if(n==1)
        {
         head=head.next; 
            return head;
        }
       while(head!=null&&n>1)
       {
         prev=head;
           head=head.next;
           n--;
       }
        prev.next=head.next;
        
      return first;
    }  
}