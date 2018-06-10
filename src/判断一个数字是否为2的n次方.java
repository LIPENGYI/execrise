/*
public class 判断一个数字是否为2的n次方 {
	public static boolean isPower(int n){
		if(n<1)
			return false;
		int i =1;
		while(i<=n){
			if(i==n)
				return true;
			i<<=1;
		}
		return false;
		
	}
	public static void main(String[] args){
		System.out.println(isPower(3));
	}
}
*/
public class  判断一个数字是否为2的n次方{
	public static boolean isPower(int n){
		if(n<1)return false;
		int m = n&(n-1);
		return m==0;
	
	}
	public static void main(String[] args){
		System.out.println(isPower(4));
	}
}