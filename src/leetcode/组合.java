package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ��� {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	public List<List<Integer>> combine(int n,int k){
		dfs(1,k,n,new ArrayList<Integer>());
		return res;
		
	}
	private void dfs(int start, int k, int n, ArrayList<Integer> tem) {
		// TODO Auto-generated method stub
		//���Ѿ�ѡ���㹻����ʱ����tmp������
		if(k == 0){
			res.add(new ArrayList<Integer>(tem));
		}
		//ÿһ��ѡ�����ֵĿ���
		for(int i = start;i<=n;i++){
			tem.add(i);
			dfs(i+1,k-1,n,tem);
			tem.remove(tem.size()-1);
		}
	}
}
