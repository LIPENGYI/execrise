package 剑指Offer;

public class 链表中倒数第k个节点 {
	public ListNode FindKthToTail(ListNode head,int k){
		if(head==null||k<=0){
			return null;
		}
		ListNode last=head;
		for(int i=1;i<k;i++){
			if(head.next!=null){
				head=head.next;
			}else{
				return null;
			}
			
		}
		while(head.next!=null){
			head=head.next;
			last=last.next;
		}		
		return last;
	}
}

