package 华为;

import java.util.Scanner;

public class 进制转换 {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		char[] numbers= reader.nextLine().substring(2).toCharArray();
		getTenNumbers(numbers);
	}

	private static void getTenNumbers(char[] numbers) {
		// TODO Auto-generated method stub
		int i=0;
		char c ;
		int sum = 0;
		while((numbers.length)!=i){
			c =numbers[i];
			if(c=='A'||c=='a'){
				sum = (int) (10*Math.pow(16, numbers.length-i-1))+sum;
			}
			else if(c=='B'||c=='b'){
				sum =(int) (11*Math.pow(16, numbers.length-i-1))+sum;
			}
			else if(c=='C'||c=='c'){
				sum =(int) (12*Math.pow(16, numbers.length-i-1))+sum;
			}
			else if(c=='D'||c=='d'){
				sum =(int) (13*Math.pow(16, numbers.length-i-1))+sum;
			}
			else if(c=='E'||c=='e'){
				sum =(int) (14*Math.pow(16, numbers.length-i-1))+sum;
			}
			else if(c=='F'||c=='f'){
				sum =(int) (15*Math.pow(16, numbers.length-i-1))+sum;
			}
			else{				
				sum =(int) ((((int)c)-48)*Math.pow(16, numbers.length-i-1))+sum;
			}
			i++;
		}
		System.out.println(sum);
	}
}
