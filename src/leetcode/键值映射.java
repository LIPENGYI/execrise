package leetcode;

import java.util.*;

public class ��ֵӳ�� {
		HashMap<String,Integer> mmp;
		public ��ֵӳ��() {
	        
	    }
	    
	    public void insert(String key, int val) {
	    	 try {
				while(true){
				     if(key == null || Integer.valueOf(val) == null)
				         break;
				     mmp.put(key, val);
				     
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    public int sum(String prefix) {
	    	int sum = 0;
	    	for(Map.Entry<String, Integer> entry:mmp.entrySet() ){
	    		if(prefix == entry.getKey().substring(0, prefix.length())){
	    			sum+=entry.getValue();
	    		}
	    	}
			return sum;	        
	    }
}
