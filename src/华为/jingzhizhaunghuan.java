package »ªÎª;

import java.util.Scanner;

public class jingzhizhaunghuan {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine().substring(2);	
		int sum = 0;
		//System.out.println(s1);
		char[] c = s1.toCharArray();
		for(int i =0 ;i<=c.length-1;i++){
			if(c[i]=='a'||c[i]=='A'){
				sum = (int) (10*Math.pow(16, c.length-i-1))+sum;
			}else if(c[i]=='b'||c[i]=='B'){
				sum = (int) (11*Math.pow(16, c.length-i-1))+sum;
			}else if(c[i]=='C'||c[i]=='c'){
				sum = (int) (12*Math.pow(16, c.length-i-1))+sum;
			}else if(c[i]=='d'||c[i]=='D'){
				sum = (int) (13*Math.pow(16, c.length-i-1))+sum;
			}else if(c[i]=='E'||c[i]=='e'){
				sum = (int) (14*Math.pow(16, c.length-i-1))+sum;
			}else if(c[i]=='f'||c[i]=='F'){
				sum = (int) (15*Math.pow(16, c.length-i-1))+sum;
			}else {
				int d = Integer.parseInt(String.valueOf(c[i]));
				sum =(int) (d*Math.pow(16, c.length-i-1))+sum;
			}
			//System.out.println(sum);
		}	
		 System.out.println(sum);
	}
}
//public class Main {
//	
//	public static void main(String[] args){
//		Scanner s = new Scanner(System.in);
//		String s1 = s.nextLine().substring(2);
//		Integer x = Integer.parseInt(s1,16);
//		System.out.println(x);	
//	}
//}
