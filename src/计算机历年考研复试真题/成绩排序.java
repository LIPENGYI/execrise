package 计算机历年考研复试真题;

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
 * 题目描述
查找和排序
题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
      都按先录入排列在前的规则处理。
   例示：
   jack      70
   peter     96
   Tom       70
   smith     67
   从高到低  成绩            
   peter     96    
   jack      70    
   Tom       70    
   smith     67    
   从低到高
   smith     67  
   Tom       70    
   jack      70    
   peter     96      
输入描述:
输入多行，先输入要排序的人的个数，然后输入排序方法0（降序）或者1（升序）再分别输入他们的名字和成绩，以一个空格隔开
输出描述:
按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开
示例1
输入

3
0
fang 90
yang 50
ning 70
输出

fang 90
ning 70
yang 50
 * */

public class 成绩排序{

	public static void main(String[] args) throws IOException {
		//Scanner s = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//总共有多上行
		
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
