package »ªÎª;

import java.util.Scanner;

public class ¾ä×ÓÄæÐò {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		String orderString = reader.nextLine();
		String[] aa = orderString.split(" ");
		int length = aa.length;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<length;i++){
			if(i==(length-1)){
				sb.append(aa[length-i-1]);
				break;
			}
			sb.append(aa[length-i-1]+" ");
		}
		System.out.println(sb.toString());
	}
}
