package paixu;

public class TestSort {
	public static void selectSort(int[] a){
		int i;
		int j;
		int temp = 0;
		int flag = 0;
		int n = a.length;
		for(i =0;i<n;i++){
			temp = a[i];
			flag = i;
			for(j=i+1;j<n;j++){
				if(a[j]<temp){
					temp = a[j];
					flag = j;
				}
			}
			if(flag!=i){
				a[flag] =a[i];
				a[i] = temp;
			}
		}
	}
	public static void main(String[] args){
		int i= 0;
		int a[] = {1,2,41,3,4,2,4,6,2};
		selectSort(a);
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");
		
	}
}
