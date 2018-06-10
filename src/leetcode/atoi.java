package leetcode;
/**
 * Implement atoi to convert a string to an integer.
Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
spoilers alert... click to show requirements for atoi.
Requirements for atoi:
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 * @author Administrator
 *
 */
public class atoi {
	public int atoi(String str){
		if(str == null || str.length()==0)
			return 0;
		int pos =0;
		while(str.charAt(pos)==' ')pos++;
		int flag = 1;
		if(str.charAt(pos)=='+')pos++;
		if(str.charAt(pos)=='-'){
			pos++;
			flag = -1;
		}
		int res = 0;
		for(int i = pos; i<str.length();i++){
			char c = str.charAt(i);
			if(c<'0'||c>'9')break;
			if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&c>'7'))return Integer.MAX_VALUE;
			if(res<Integer.MIN_VALUE/10||(res==Integer.MIN_VALUE/10&&c>'8'))return Integer.MIN_VALUE;
			res = res*10 + (c-'0')*flag;
		}
		return res;
		
	}
}
