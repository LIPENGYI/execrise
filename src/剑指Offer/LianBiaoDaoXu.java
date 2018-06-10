package ½£Ö¸Offer;

import java.util.ArrayList;
import java.util.Stack;

public class LianBiaoDaoXu {
	public static void main(String[] args) {
		
	}
	public static ArrayList<ListNode> get(ListNode listnode){
		Stack<ListNode> ss = new Stack<ListNode>();
		while(listnode!=null){
			ss.push(listnode);
			listnode = listnode.next;
		}
		ArrayList<ListNode> aa = new ArrayList<ListNode>();
		while(!ss.isEmpty()){
			aa.add(ss.pop());
		}
		return aa;
		
	}

}
 