package leetcode;

public class Æß½øÖÆÊı {
	public String convertToBase7(int num){
		if(num == 0){
			return "0";
		}
		boolean flag = (num>0)?true:false;
		num = (num>0)?num:num*(-1);
		String res ="";
		int tmp;
		while(num!=0){
			tmp = num%7;
			num /= 7;
			res = ""+tmp+res;
		}
		if(!flag){
			res = "-"+res;
		}
		return null;		
	}
}
