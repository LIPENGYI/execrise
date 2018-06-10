package »ªÎª;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ×Ö·û´®Æ¥Åä {
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = "1234";
		
		String str;
		while((str = bf.readLine())!=null){
			String str2 = bf.readLine();
			int i;
			for(i=0;i<str.length();i++)
			{
				if(str2.indexOf(str.charAt(i))==-1)
				{
					System.out.println("false");
					i--;
					break;
				}
			}
			if(i==str.length()){
				System.out.println("true");
			}
		}
		bf.close();
	}
}
