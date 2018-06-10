package leetcode;

public class 数字转换为16进制 {
	char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	public String toHex(int num){
		if(num == 0)
			return "";
		String result = "";
		while(num!=0){
			result = map[(num&0xF)]+result;
			num = (num>>>4);
		}
		return result;
		
	}
}
