package »ªÎª;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ZiDianPaiXu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();	
		String[] ss = new String[num];
		List<String> l = new ArrayList<String>();
		for(int i=0;i<num;i++){
			if(s.hasNext()){
			ss[i] = s.next();
			l.add(ss[i]);
		}			
		}
		Collections.sort(l);
		for(String j : l){
			System.out.println(j);
		}
	}
}
//public class ZiDianPaiXu{
//	public static void main(String[] args){
//		Scanner ss = new Scanner(System.in);
//		String s = ss.nextLine();
//		System.out.println(s);
//	}
//}
