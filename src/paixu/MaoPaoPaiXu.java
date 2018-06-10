package paixu;

public class MaoPaoPaiXu {
	public static void BubbleSort(int array[]){
		int i,j;
		int len = array.length;
		int temp;
		for(i = 0;i<len-1;i++){
			for(j=1;j<len-i;j++){
				if(array[j]<array[j-1]){
					temp = array[j];
					array[j]=array[j-1];
					array[j-1] =temp;
				}
			}
		}
		
	}
	public static void main(String[] args){
		int a[]= {5,4,9,8,7,6,2};
		BubbleSort(a);
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
