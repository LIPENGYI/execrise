package 华为;
/*
 * 
 *  题目描述
	数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
	输入描述:
	先输入键值对的个数
	然后输入成对的index和value值，以空格隔开
	输出描述:
	输出合并后的键值对（多行）
	示例1
	输入
	
	4
	0 1
	0 2
	1 2
	3 4
	输出
	
	0 3
	1 2
	3 4
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class 合并表记录 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numbers = Integer.valueOf(reader.readLine());
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int key = 0;
		int value = 0;
		int next = 0;
		for(int i = 0;i<numbers;i++){
			String[] a = reader.readLine().split(" ");
			key = Integer.parseInt(a[0]);
			value = Integer.parseInt(a[1]);
			if(map.get(key)==null){
				map.put(key, value);
			}else{
			  	value = map.get(key)+next;
			  	map.put(key, value);
			}
		}
		List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getValue());
			}
			
		});
		/*for(Map.Entry<Integer, Integer> mapping:map.entrySet()){
			System.out.println(mapping.getKey()+" "+mapping.getValue());
		}*/
		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()){
			@SuppressWarnings("rawtypes")
			Map.Entry e =(Map.Entry)it.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
