package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 子集 {
	public List<List<Integer>> subsets(int[] S){
		Arrays.sort(S);
		return null;
		
	}
	public void helper(int[] S,int index,List<List<Integer>> res,List<Integer>tmp){
		if(index>=S.length) return;
		//不加入当前元素产生的集合，然后继续递归
		helper(S,index+1,res,tmp);
		List<Integer> tmp2 = new ArrayList<Integer>(tmp);
		tmp2.add(S[index]);
		res.add(tmp2);
		helper(S,index+1,res,tmp2);
	}
}
