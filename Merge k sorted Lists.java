//Merge k sorted Lists
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
    class NodeComparator implements Comparator<ListNode> {

	public int compare(ListNode k1, ListNode k2)
	{
		if (k1.val > k2.val)
			return 1;
		else if (k1.val < k2.val)
			return -1;
		return 0;
	}
}
    public ListNode mergeKLists(ListNode[] lists) 
    {
            int n=lists.length;
            PriorityQueue<ListNode> q=new PriorityQueue<>(new NodeComparator());
            for(int i=0;i<n;i++)
            {
                if(lists[i]!=null)
                    q.add(lists[i]);
            }
            if(q.isEmpty())
                return null;
            ListNode head=null;
            ListNode temp=null;
            ListNode cur=null;
            while(!q.isEmpty())
            {
                cur=q.poll();
                if(head==null)
                {
                    head=cur;
                    temp=cur;
                }
                else
                {
                    temp.next=cur;
                    temp=temp.next;
                }
                if(cur.next!=null)
                {
                    q.add(cur.next);
                }
            }
            return head;
    }
}