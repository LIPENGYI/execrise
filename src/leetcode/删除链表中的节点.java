package leetcode;

public class 删除链表中的节点 {
	public void deletNode(ListNode node){
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
