package leetcode;

import java.util.ArrayList;
import java.util.List;

public class 组合 {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	public List<List<Integer>> combine(int n,int k){
		dfs(1,k,n,new ArrayList<Integer>());
		return res;
		
	}
	private void dfs(int start, int k, int n, ArrayList<Integer> tem) {
		// TODO Auto-generated method stub
		//当已经选择足够数字时，将tmp加入结果
		if(k == 0){
			res.add(new ArrayList<Integer>(tem));
		}
		//每一种选择数字的可能
		for(int i = start;i<=n;i++){
			tem.add(i);
			dfs(i+1,k-1,n,tem);
			tem.remove(tem.size()-1);
		}
	}
}
