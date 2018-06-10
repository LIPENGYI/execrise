package leetcode;

public class BitÎ»¸öÊı {
	public int[] countBits(int num){
		int[] res = new int[num+1];
		for(int i =0;i<num+1;i++){
			res[i] = countBit(i);
		}
		return null;
		
	}

	private int countBit(int i) {
		// TODO Auto-generated method stub
		return (int)Integer.toBinaryString(i).chars().filter(c->'1' == c).count();
	}
}
