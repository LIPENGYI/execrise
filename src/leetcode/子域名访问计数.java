package leetcode;

import java.util.*;

public class 子域名访问计数 {
	public List<String> subdomainVisits(String[] cpdomains){
		Map<String,Integer> map = new HashMap<>();
		for(String domain:cpdomains){
			if(domain.length() == 0)
				continue;
			int index = domain.indexOf(' ');
			int time = Integer.valueOf(domain.substring(0,index));
			domain = domain.substring(index+1);
			map.put(domain, map.getOrDefault(domain, 0)+time);
			//子域名的边界‘.’
			while(domain.indexOf('.')!=-1){
				domain = domain.substring(domain.indexOf('.')+1);
				map.put(domain, map.getOrDefault(domain, 0)+time);
			}
		}
		List<String> res = new ArrayList<>();
		for(Map.Entry<String, Integer>entry : map.entrySet()){
			String s = entry.getValue()+" "+entry.getKey();
			res.add(s);
		}
		return res;
		
	}
}
