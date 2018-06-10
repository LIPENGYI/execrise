import java.util.*;

public class Demo {
	public static void main(String args[]){
		System.out.println(getNumber(0));
		System.out.println(getNumber(1));
		System.out.println(getNumber(2));
		System.out.println(getNumber(3));
		char a ='Äã';
		System.out.println(a);
		HashMap a1  =new HashMap();
		Map m = Collections.synchronizedMap(a1); 
		Hashtable t = new Hashtable();
	}
	public static int getNumber(int num){
		try {
			int result = 2/num;
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return 0;
		}finally{
			if(num == 0){
				return -1;
			}
			if(num == 1){
				return 1;
			}
		}
	}
}
