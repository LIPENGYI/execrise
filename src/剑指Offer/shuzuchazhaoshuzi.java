package ½£Ö¸Offer;

import java.util.Scanner;

public class shuzuchazhaoshuzi {

	public static void main(String[] args) {
	  /*int[][] a =new int[3][2];
	  int s = a.length;
	  System.out.println(s);*/
		
	}
	public boolean Find(int target,int [][] array){
		int len = array.length-1;
		int i=0;
		while((i<array[0].length)&&(len>0)){
			if(array[len][i]<target){
				i++;
			}else if(array[len][i]>target){
				len--;
			}else{
				return true;
			}
		}
		
		return false;
		
	}

}
/*public class Solution {
    public boolean Find(int [][] array,int target) {
int len = array.length-1;
        int i = 0;
        while((len >= 0)&& (i < array[0].length)){
            if(array[len][i] > target){
                len--;
            }else if(array[len][i] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}*/