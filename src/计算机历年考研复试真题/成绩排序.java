package ��������꿼�и�������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * ��Ŀ����
���Һ�����
��Ŀ���������⣨�û����ɼ������У����Ի�óɼ��Ӹߵ��ͻ�ӵ͵��ߵ�����,��ͬ�ɼ�
      ������¼��������ǰ�Ĺ�����
   ��ʾ��
   jack      70
   peter     96
   Tom       70
   smith     67
   �Ӹߵ���  �ɼ�            
   peter     96    
   jack      70    
   Tom       70    
   smith     67    
   �ӵ͵���
   smith     67  
   Tom       70    
   jack      70    
   peter     96      
��������:
������У�������Ҫ������˵ĸ�����Ȼ���������򷽷�0�����򣩻���1�������ٷֱ��������ǵ����ֺͳɼ�����һ���ո����
�������:
����ָ����ʽ������ֺͳɼ������ֺͳɼ�֮����һ���ո����
ʾ��1
����

3
0
fang 90
yang 50
ning 70
���

fang 90
ning 70
yang 50
 * */

public class �ɼ�����{

	public static void main(String[] args) throws IOException {
		//Scanner s = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//�ܹ��ж�����
		
		//int lines = s.nextInt();
		int lines = Integer.parseInt(reader.readLine());
		int order = Integer.parseInt(reader.readLine());
		Map<String,Integer> valuesandname = new HashMap<String,Integer>();
		for(int i=0;i<lines;i++){
			//String[] line = s.nextLine().split(" ");
			//valuesandname.put(Integer.valueOf(line[0]), line[0]);
			String[] line = reader.readLine().split(" ");	
			valuesandname.put(line[0],Integer.valueOf(line[1]));
			
		}
		List<Map.Entry<String, Integer>> infoIds = new ArrayList<Map.Entry<String, Integer>>(valuesandname.entrySet());
		if(order == 1){
			Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {  
			    public int compare(Map.Entry<String, Integer> o1,  
			            Map.Entry<String, Integer> o2) {  
			        return ( o1.getValue()-o2.getValue());  
			    }  
			});  
		}else{
			Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {  
			    public int compare(Map.Entry<String, Integer> o1,  
			            Map.Entry<String, Integer> o2) {  
			        return ( o2.getValue()-o1.getValue());  
			    }  
			});  
		}
		for (int i = 0; i < infoIds.size(); i++) {  

		    Entry<String,Integer> ent=infoIds.get(i);  

		    System.out.println(ent.getKey()+"="+ent.getValue());  
		}
	}
}
