package ��Ϊ;

import java.util.Scanner;

public class ��С�����5�κ�����·�̺͵�5�η����ĸ߶� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		while(sc.hasNext()){
			Double high = sc.nextDouble();
			Double s = getJourney(high);
			Double n= getTenthHigh(high);
			System.out.println(s);
			System.out.println(n);
		}
		
	}
	 public static double getJourney(double high){
	     double sum = 0-high;
		 for(int i=0;i<5;i++){
			
	    	sum+=high*2;
	    	high = high/2;
	     }  
		
		 return sum;
	 }
	 public static double getTenthHigh(double high)
	    {
		 for(int i=0;i<5;i++){
				
		    	
		    	high = high/2;
		     } 
		 return high;
	    }
}
