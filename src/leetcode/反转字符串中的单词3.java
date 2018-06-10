package leetcode;

public class 反转字符串中的单词3 {
	public String reverseWords(String s){
		char[] arr = s.toCharArray();
		int p1 = 0;
		int p2 = 0;
		while(p1<arr.length){
			while(p2<arr.length&&arr[p2]!=' '){
				p2++;
			}
			int left = p1;
			int right = p2-1;
			while(left<right){
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right]  = temp;
				left++;
				right--;
			}
			p1 = p2+1;
			p2++;
		}
		return new String(arr);		
	}
}
