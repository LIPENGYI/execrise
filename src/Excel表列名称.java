
public class Excel�������� {
	public String convertToTiltle(int n){
		String res = "";
		while(n!=0){
			res+=  String.valueOf((char)(--n%26 + 'A'));
			
			n/=26;
		}
		StringBuffer s  = new StringBuffer(res);
		
		return s.reverse().toString();
		
	}
}
