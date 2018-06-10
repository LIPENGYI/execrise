package »ªÎª;

import java.util.Scanner;

public class JuZiNiXu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sns = s.nextLine();
		String[] st = sns.split(" ");
		int num = st.length;
		StringBuffer sb = new StringBuffer();
		for(int i=num-1;i>=0;i--){
			if(i==0){
				sb.append(st[i]);
				break;
			}		
			sb.append(st[i]+" ");
		}
		
		System.out.println(sb.toString());
	}
}
