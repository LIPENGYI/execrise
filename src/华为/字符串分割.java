package »ªÎª;
import java.util.Scanner;

public class ×Ö·û´®·Ö¸î {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception{
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner reader = new Scanner(System.in);
		while(reader.hasNextLine()){
			getString(reader.nextLine());
		}
	}
	public static void getString(String a) throws Exception{
		if(a.length()<8){
		 String x = (a+"00000000").substring(0, 8);
		 System.out.println(x);
		}
		else{
		  int c = a.length();
		  while(c>8){
		  String x = a.substring(0,8);
		  System.out.println(x);
		  c = a.length()-8;
		  a =a.substring(8);
		  }
		  if(c<8&&c>=1){
			  System.out.println((a+"00000000").substring(0, 8));
		  }
		}
	}
}
