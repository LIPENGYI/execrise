package ��ָOffer;
import java.util.*;
public class �������е���λ�� {
	LinkedList<Integer> list = new LinkedList<Integer>();
	public void Insert(Integer num){
		if(list.size() == 0||num<list.getFirst()){
			list.addFirst(num);
		}else{
			boolean insertFlag = false;
			for(Integer e:list){
				if(num<e){
					int index = list.indexOf(e);
					list.add(index,num);
					insertFlag = true;
					break;
				}
			}
			if(!insertFlag){
				list.addLast(num);
			}
		}
	}
	public Double GetMedian(){
		if(list.size() == 0){
			return null;
		}
		if(list.size()%2==0){
			int i = list.size()/2;
			Double a = Double.valueOf(list.get(i-1)+list.get(i));
			return a/2;
		}
		list.get(0);
		Double b = Double.valueOf(list.get(list.size()+1)/2-1);
		return Double.valueOf(list.get(list.size()+1)/2-1);		
	}
}
