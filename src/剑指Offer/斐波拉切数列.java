package ��ָOffer;

public class 쳲��������� {
	public static int getFib(int n){
		if(n<0){
			return -1;
		}else if(n==0){
			return 0;
		}else if(n==1||n==2){
			return 1;
		}else{
			return getFib(n-1)+getFib(n-2);
		}
	}
}
