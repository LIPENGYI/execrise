package leetcode;

public class intoToRoman {
	public String inToRoman(int num){
		String[][] map = {
				{"","I","II","III","IV","V","VI","VII","VIII","IX"},
	            {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
	            {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
	            {"","M","MM","MMM"}	
		};
		StringBuilder roman = new StringBuilder();
		roman.append(map[3][num/1000%10]);
		roman.append(map[2][num/100%10]);
		roman.append(map[1][num/10%10]);
		roman.append(map[0][num%10]);
		return roman.toString();
		
	}
}
