package 华为;

import java.util.Scanner;

public class 统计每个月兔子的总数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int month = sc.nextInt();
			System.out.println(getTotalCount(month));
		}
	}

	private static int getTotalCount(int month) {
		// TODO Auto-generated method stub
		if(month<=0)
			return 0;
		if(month==1||month==2){
			return 1;
		}
		int c1= 1;
		int c2 = 1;
		for(int i=3;i<=month;i++){
			int c3 = c1+c2;
			c1 = c2;
			c2 = c3;
		}
		return c2;
		
	}

}
