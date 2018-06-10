package leetcode;
/*
 * 解题思路：

这个题目一开始我的思路是只看最后4个数，然后一共8种情况分情况讨论，后来发现有些情况的答案是不确定的，需要看更多的数才能决定，后来上网看了一下别人的思路觉得很好，思路如下：

由于10， 11两个编码都是以1开头的，这意味着只要是以1开头的后面一个数必定是根这个1一起的字符编码。利用这一点：

用一个指针从前向后走，遇到1就走两步，遇到0就走一步，看最后是不是走到n-1的位置，说明最后的0只能是单独存在的，否则走到n的位置就说明这个0是跟前面的1一起的。*/
public class 一比特与2比特字符 {
	public boolean isOneBitCharacter(int[] bits){
		int i = 0;
		for(i=0;i<bits.length-1;){
			if(bits[i] == 0){
				i++;
			}else{
				i+=2;
			}
		}
		System.out.println(i);
		return (i == bits.length-1)? true:false;
	}
}
