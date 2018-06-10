package leetcode;
/**
 * Given an array of strings, return all groups of strings that are anagrams.
   Note: All inputs will be in lower-case.
 */
import java.util.*;

public class anagrams {
	public ArrayList<String> anagrams(String[] strs){
		HashMap<String,Integer> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0;i<strs.length;i++){
			String s = strs[i];
			char[] array = s.toCharArray();
			Arrays.sort(array);
			s = new String(array);
			if(!map.containsKey(s)){
				map.put(s,i);
			}else{
				int index = map.get(s);
				set.add(index);
				set.add(i);
			}
		}
		Iterator iter =set.iterator();
		while(iter.hasNext()){
			Integer x = (Integer)iter.next();
			list.add(strs[x]);
		}
		return list;
		
	}
}
