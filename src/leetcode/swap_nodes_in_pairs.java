package leetcode;
class ListNode {
    int val;
    ListNode next;
     ListNode(int x) {
         val = x;
        next = null;
     }
}
public class swap_nodes_in_pairs {
	public ListNode swapPairs(ListNode head){	
		ListNode preHead = new ListNode(-1);
		preHead.next = head;
		for(ListNode cur = head,pre = preHead,tmp;cur!=null&& cur.next!=null;pre = cur,cur =cur.next){
			tmp =cur.next;
			cur.next = tmp.next;
			tmp.next = pre.next;
			pre.next  =tmp;
		}
		return preHead.next;
		}
}

