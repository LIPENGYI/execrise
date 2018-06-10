package leetcode;


public class K_node {
	public ListNode reverseKGroup(ListNode head,int k){
		if(head == null || k<2)
			return head;		
		ListNode first = new ListNode(-1);
		first.next = head;
		ListNode pre = first;
		ListNode cur = head;
		ListNode temp = null;
		int len = 0;
		while(head!=null){
			head = head.next;
			len++;
		}
		int count = len/k;
		while(count-->0){
			int c = k;
			while(c-->1){
			temp = cur.next;
			cur.next = temp.next;
			temp.next = pre.next;
			pre.next = temp;
			}
			pre = cur;
			cur  = cur.next;
		}	
		return first.next;
		/*if (head == null || k < 2)
            return head;
        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode pre = first;
        ListNode cur = head;
        ListNode temp = null;
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        int count = len/k;
        while(count-->0){
            int c = k;
            while(c-->1){
                temp = cur.next;
                cur.next = temp.next;
                temp.next=pre.next;
                pre.next = temp;
            }
            pre = cur;
            cur = cur.next;
        }
        return first.next;*/
	}
}
