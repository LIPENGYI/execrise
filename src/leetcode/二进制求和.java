package leetcode;

public class 二进制求和 {
	public String addBinary(String a,String b){
		if(a.length()<b.length()){
			String temp = a;
			a = b;
			b = temp;
		}
		int alen = a.length(),blen = b.length();
		StringBuilder sb = new StringBuilder("");
		int carry = 0;
		int i = 0;
		for(;i<blen;i++){
			int sum = carry+a.charAt(alen-1-i)+b.charAt(blen-1-i)-2*'0';
			char cur = (char)('0'+sum%2);
			carry = sum/2;
			sb.insert(0, cur);
		}
		for(;i<alen;i++){
			int sum = carry+a.charAt(alen-1-i)-'0';
			char cur = (char)('0'+sum%2);
			carry = sum/2;
			sb.insert(0, cur);
		}
		if(carry != 0){
			sb.insert(0, (char)('0'+carry));
		}
		return sb.toString();
		
	}
}