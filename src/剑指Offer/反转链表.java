package ��ָOffer;

public class ��ת���� {
	public ListNode ReverseList(ListNode head){
		if(head==null)
			return null;
		ListNode pre = null;
		ListNode next = null;
		while(head!=null){
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;		
	}
}
