package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class �Ӽ� {
	public List<List<Integer>> subsets(int[] S){
		Arrays.sort(S);
		return null;
		
	}
	public void helper(int[] S,int index,List<List<Integer>> res,List<Integer>tmp){
		if(index>=S.length) return;
		//�����뵱ǰԪ�ز����ļ��ϣ�Ȼ������ݹ�
		helper(S,index+1,res,tmp);
		List<Integer> tmp2 = new ArrayList<Integer>(tmp);
		tmp2.add(S[index]);
		res.add(tmp2);
		helper(S,index+1,res,tmp2);
	}
}
