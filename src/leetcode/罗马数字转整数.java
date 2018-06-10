package leetcode;

public class 罗马数字转整数 {
	public int romanToInt(String s){
		char[] num = s.toCharArray();
		int pre = charToInt(num[0]);
		int result = pre;
		int now = 0;
		for(int j=1;j<s.length();j++){
			now = charToInt(num[j]);
			if(pre>=now){
				result+=now;
			}
			else{
				result = result+now-2*pre;
			}
			pre = now;
		}
		return result;
		
	}
	public int charToInt(char c){
		int value = 0;
		switch(c)
		{
			case 'I': value = 1; break;
			case 'V': value = 5; break;
			case 'X': value = 10;break;
			case 'L': value = 50; break;
			case 'C': value = 100;break;
			case 'D': value = 500;break;
			case 'M': value = 1000;break;
		}
		return value;
		
	}
}
