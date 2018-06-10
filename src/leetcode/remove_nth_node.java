package leetcode;

public class remove_nth_node {
	public ListNode removeNthFromEnd(ListNode head, int n){
		ListNode pre = new ListNode(-1);
		pre.next = head;
		ListNode fast = head;
		ListNode slow = pre;
		while(fast!=null&&n>0){
			fast = fast.next;
			n--;
		}
		while(fast!=null){
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return pre.next;
		
	}
}
