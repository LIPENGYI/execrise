package 华为;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 坐标移动 {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String[] aa = reader.nextLine().split(";");
		int X = 0;
		int Y = 0;
		//&&Pattern.matches("^[0-9]*$", aa[i].substring(1,aa.length))
		for(int i=0;i<aa.length;i++){
			
			char x;
			//A表示向左移动
			try {
				 x = aa[i].toUpperCase().charAt(0);
				if(x=='A'){
					X=X-Integer.parseInt(aa[i].substring(1));
				//D表示向右移动	
				}else if(x=='D'){
					X=X+Integer.parseInt(aa[i].substring(1));
				//W表示向上移动	
				}else if(x=='W'){
					Y=Y+Integer.parseInt(aa[i].substring(1));
				//S表示向下移动		
				}else if(x=='S'){
					Y=Y-Integer.parseInt(aa[i].substring(1));
				//S表示向下移动	
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				continue;
			}
		}
		System.out.println(X+","+Y);
	}
}
