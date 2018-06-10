
public class 求数组中的第二大数 {
	public static int FindSecMax(int data[]){
		int count = data.length;
		int maxnumber = data[0];
		int sec_max = Integer.MIN_VALUE;
		for(int i =1;i<count;i++){
			if(data[i]>maxnumber){
				sec_max = maxnumber;
				maxnumber = data[i];
			}else if(data[i]>sec_max){
				sec_max = data[i];
			}
		}
		return sec_max;
		
	}
	public static void main(String[] args){
		int[] array = {1,2,3};
		System.out.println(array);
	}
}
