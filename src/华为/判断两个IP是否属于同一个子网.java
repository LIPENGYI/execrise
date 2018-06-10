package 华为;

import java.util.Scanner;

public class 判断两个IP是否属于同一个子网 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] mask = sc.next().split("\\.");
			String[] ip1s = sc.next().split("\\.");
			String[] ip2s = sc.next().split("\\.");
			for(int i = 0;i<mask.length;i++){
				if(Integer.valueOf(mask[i])<0||Integer.valueOf(mask[i])>255||Integer.valueOf(ip1s[i])<0||Integer.valueOf(ip1s[i])>255||Integer.valueOf(ip2s[i])<0||Integer.valueOf(ip2s[i])>255){
					System.out.println(1);
					break;
				}
				
				else if((Integer.valueOf(mask[i])&Integer.valueOf(ip1s[i])) == (Integer.valueOf(mask[i])&Integer.valueOf(ip2s[i]))){
					System.out.println(0);					
				}
				else{
					System.out.println("2");
					break;
				}
			}
		}
	}
}
