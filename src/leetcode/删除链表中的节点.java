package leetcode;

public class ɾ�������еĽڵ� {
	public void deletNode(ListNode node){
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
