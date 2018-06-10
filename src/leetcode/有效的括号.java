package leetcode;

import java.util.Stack;

public class ÓÐÐ§µÄÀ¨ºÅ {
	public boolean isValid(String s){
		if(s.length()==0){
			return true;
		}
		if(s.length()%2==1){
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++){
			Character c =s.charAt(i);
			if(c!='('&&c!=')'&&c!='['&&c!=']'&&c!='{'&&c!='}'){
				return false;
			}
			if(c=='('||c=='['||c=='{'){
				stack.push(c);
			}else{
				if(stack.isEmpty()){
					return false;
				}
				if(c==')'){
					if(stack.peek()!='('){
						return false;
					}
					else{
						stack.pop();
					}				
				}
				else if(c==']'){
					if(stack.peek()!='['){
						return false;
					}
					else{
						stack.pop();
					}
				}
				else{
					if(stack.peek()!='{'){
						return false;
					}
					else{
						stack.pop();
					}
				}
			}
		}
		if(!stack.isEmpty()){
			return false;
		}
		else{
			return true;
		}	
	}
}
