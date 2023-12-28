//Reorder List
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
    public ListNode rev(ListNode head)
    {
        ListNode pre=null;
        ListNode cur=head;
        ListNode post=null;
        while(cur!=null)
        {
            post=cur;
            cur=cur.next;
            post.next=pre;
            pre=post;
        }
        head=pre;
        return head;
    }
    public ListNode reorderList(ListNode head) {
        int len=0;
        ListNode temp=head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<((len/2)+(len%2));i++)
        {
            temp=temp.next;
        }
        ListNode list2=temp.next;
        temp.next=null;
        list2=rev(list2);
        temp=head;
        ListNode temp2=list2;
        ListNode t1,t2;
        while(temp2!=null)
        {
            t1=temp.next;
            t2=temp2.next;
            temp.next=temp2;
            temp2.next=t1;
            temp=t1;
            temp2=t2;
        }
        return head;
        
    }
}