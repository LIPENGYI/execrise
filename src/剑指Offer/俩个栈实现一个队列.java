package ��ָOffer;

import java.util.Stack;

public class ����ջʵ��һ������ {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	public void push(int node){
		stack1.push(node);
	}
	public int pop(){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		int note = stack2.pop();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		return note;
	}
}
