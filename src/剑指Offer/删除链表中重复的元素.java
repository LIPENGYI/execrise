package 剑指Offer;

public class 删除链表中重复的元素 {
	public ListNode deleteDubpliacation(ListNode pHead){
		if(pHead == null)
			return null;
		ListNode p = pHead;
		ListNode n = new ListNode(0);
		ListNode pre = n;
		n.next = pHead;
		while(p!=null){
			ListNode q = pHead.next;
			if(q==null)break;
			if(q.val==p.val){
				while(q!=null&&q.val==p.val){
					q=q.next;
				}
				pre.next = q;
				p=q;
			}else{
				pre = p;
				p = q;
			}
		}
		return n.next;	
	}
}
