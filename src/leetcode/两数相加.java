package leetcode;

public class ������� {
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode root = new ListNode(0);//ͷ���
		ListNode r = root;
		root.next = l1;
		int carray = 0;//��ʼ��λ
		int sum;
		
		while(p1 !=null && p2 != null){
			sum = p1.val+p2.val;
			p1.val = sum%10;//��λ�Ľ��
			carray = sum/10;
			r.next = p1;
			r = p1; //ָ����ӵĽڵ�
			p1 = p1.next;
			p2 = p2.next;
		}
		if(p1 == null){
			r.next = p2;
		}else{
			r.next = p1;
		}
		//���һ����ӻ��н�λ
		if(carray == 1){
			while(r.next != null){
				sum = r.next.val + carray;
				r.next.val = sum%10;
				carray = sum/10;
				r = r.next;
			}
			if(carray == 1){
				r.next  = new ListNode(1);
			}
		}
		
		
		return root.next;
		
	}
}
