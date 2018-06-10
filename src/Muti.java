
public class Muti {
	public static int power(int m ,int n){
		for(int i =1;i<=n;i++){
			m = m<<1;
		}
		return m;
		
	}
	public static void main(String[] args){
		System.out.println("2*8="+power(2,3));
	}
}
