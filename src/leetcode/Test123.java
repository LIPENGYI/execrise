package leetcode;

public class Test123 {
	 public int[] plusOne(int[] digits) {
	        long length = digits.length;
	        long sum = 0;
	        for(long i = 0;i<length;i++){
	            sum = sum+digits[(int) i]*((long)(Math.pow(10, length-1-i)));
	        }
	        sum = sum+1;
	        String sb = ""+sum;
	        int[] endnums = new int[sb.length()];
	        for(int i = 0;i<sb.length();i++){
	            endnums[i] = sb.charAt(i)-48;
	        }
	        
	        return endnums;
	    }
}
