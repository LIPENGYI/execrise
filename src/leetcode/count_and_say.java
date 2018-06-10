package leetcode;

public class count_and_say {
	public String countAndSay(int n){
		if(n<1)
			return null;
		String res ="1";
		while(--n>0){
			res  = core(res);
		}
		return res;		
	}
	@SuppressWarnings("unused")
	private String core(String s){
		char[] ch =s.toCharArray();
		char c = ch[0];
		StringBuilder res = new StringBuilder();
		int num =1;
		for(int i =1;i<ch.length;++i){
			if(ch[i] == c){
				num++;
				continue;
			}
			res.append(num);
			res.append(c);
			c = ch[i];
			num = 1;
		}
		res.append(num);
		res.append(c);
		return res.toString();
	}
}
