
/*public class �����������1�ĸ��� {
	public static int countOne(int n){
		int count = 0;
		while(n>0){
			if((n&1)==1)
				count++;
			n>>=1;
		}
		return count;
	}
	public static void main(String[] args){
		System.out.println(countOne(7));
		System.out.println(countOne(8));
	}
}*/
public class �����������1�ĸ���{
	public static int countOne(int n){
		int count = 0;
		while(n>0){
			if(n!=0)
				 n = n&(n-1);
			count++;
		}
		return count;
		
	}
	public static void main(String[] args){
		System.out.println(countOne(7));
	}
}