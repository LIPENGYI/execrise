package ��ָOffer;

public class ��������˳��ʹ����λ��ż��ǰ {
	public void reOrderArray(int [] array) {
        int i = array.length;
		int [] array1 = new int[i];
		StringBuffer s = new StringBuffer();
		for(int j=0;j<i;j++){
			if(array[j]%2==1){
				s.append(array[j]);
			}
		}
		for(int k=0;k<i;k++){
			if(array[k]%2==0){
				s.append(array[k]);
			}
		}
		String ss =s.toString();
		char[] c = ss.toCharArray();
		for(int n=0;n<i;n++){
			String nn = String.valueOf(c[n]);
			array[n] = Integer.parseInt(nn);
		}		
    }
}
