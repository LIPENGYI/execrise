package leetcode;



/**
    You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
 * @author Administrator
 *
 */

public class add_numbers {
   public ListNode addTwoNumbers(ListNode l1,ListNode l2){
	   ListNode head = new ListNode(0);
	   ListNode p = head;
	   int sum =0;
	   while(l1!=null||l2!=null||sum!=0){
		   if(l1!=null){
			   sum+=l1.val;
			   l1 = l1.next;
		   }
		   if(l2!=null){
			   sum+=l2.val;
			   l2=l2.next;
		   }
		   p.next = new ListNode(sum%10);
		   p=p.next;
		   sum=sum/10;
	   }
		return head.next;
		   
   }
   
}
