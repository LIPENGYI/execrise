package ��ָOffer;

public class ��ת�������С���� {
	public int minNumberInRotateArray(int [] array) {
		int a = array.length;
		if(a==0){
			return 0;
		}
		for(int i=0;i<array.length-1;i++){
			if(array[i]>array[i+1]){
				return array[i+1];
			}else {
				if(i==array.length-2){
					return array[0];
				}
			}
		}
		return 0;	    
    }
}
