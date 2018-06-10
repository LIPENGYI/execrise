package leetcode;

public class 整数转罗马数字 {
	public String intToRoman(int num){
		String digit[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String ten[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String hundred[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String thousand[] = {"","M","MM","MMM"};
		String str = "";
		return str+thousand[num/1000]+hundred[num%100/100]+ten[num%100/10]+digit[num%10];		
	}
}
