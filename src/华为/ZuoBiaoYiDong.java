package »ªÎª;

import java.util.Scanner;

public class ZuoBiaoYiDong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String st = s.nextLine();
		String[] ss = st.split(";");
		int x=0,y=0;
		for(int i=0;i<ss.length;i++){			
			String n = ss[i].substring(0, 1);
			//System.out.println(n);
			String m = ss[i].substring(1);
			int m1 = Integer.parseInt(m);
			//System.out.println(m1);
			if(!(m1>0&&m1<=99)){
				continue;
			}
			if(n.charAt(0)=='A'){
				x-=m1;
				//System.out.println(m1);
			}else if(n.charAt(0)=='D'){
				x+=m1;
			}else if(n.charAt(0)=='S'){
				y-=m1;
			}else if(n.charAt(0)=='W'){
				y+=m1;
			}
		}
		System.out.println(x+","+y);
	}
}
