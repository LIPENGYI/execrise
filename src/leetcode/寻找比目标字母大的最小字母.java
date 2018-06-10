package leetcode;

public class 寻找比目标字母大的最小字母 {
	public char nextGreatestLetter(char[] letters,char target){
		int n = letters.length;
		int start = 0,end = n;
		while(start<end){
			int mid = start+(end - start)/2;
			if(target<letters[mid]){
				end = mid;
			}else{
				start = mid+1;
			}
		}
		return letters[start%n];		
	}
}
