package 剑指Offer;

public class 合并两个排序列表 {
	public ListNode Merge(ListNode list1,ListNode list2){
		/*ListNode list3 = null;
		ListNode questiHead = new ListNode(-1);
		ListNode List3 = questiHead;
		while(list1.next!=null||list2.next!=null){
			if(list1.next==null){
				list3=list2;
			}
			if(list2.next==null){
				list3 = list1;
			}
			if(list1.val<list2.val){
				list3.next=list1;
				list1 = list1.next;
			}
			if(list1.val>list2.val){
				list3.next=list2;
				list2=list2.next;
			}
		}
		
		return questiHead;
		*/
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
		ListNode quasiHead = new ListNode(-1);
		ListNode p = quasiHead;
		while(list1!=null && list2!=null){
			if(list1.val<list2.val){
				p.next = list1;
				list1 = list1.next;
			}
			else{
				p.next = list2;
				list2= list2.next;
			}
			p=p.next;
		}
		if(list1!=null){
			p.next = list1;
		}
		if(list2!=null){
			p.next=list2;
		}
		return quasiHead.next;
	}
}
