package »ªÎª;

import java.util.Scanner;
import java.util.TreeSet;

//package huawei;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class MingMingDeSuiJiShu {

	public static void main(String[] args)throws IOException  {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int num = s.nextInt();
			TreeSet<Integer> set1 = new TreeSet<Integer>();
			for(int i = 0;i<num;i++){
				int s1 =s.nextInt();
				set1.add(s1);
			}
			for(Integer j:set1){
				System.out.println(j);
			}
		}
		
	}

}

