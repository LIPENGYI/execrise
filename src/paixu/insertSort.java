package paixu;

public class insertSort {
	public static void insertSort(int[] a){
		if(a !=null){
			for(int i =1;i<a.length;i++){
				int temp = a[i],j=i;
				if(a[j-1]>temp){
					while(j>=1&&a[j-1]>temp){
						a[j] = a[j-1];
						j--;
					}
				}
				a[j] = temp;				
			}
		}
	}
	public static void main(String[] args){
		int[] array = {1,2,43,5,7,89,32,5};
		insertSort(array);
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
