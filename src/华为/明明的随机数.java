package 华为;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
  
  
public class 明明的随机数 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            TreeSet<Integer> tc = new TreeSet<Integer>();
            while(num-->0&&sc.hasNextInt()){
                tc.add(sc.nextInt());
            }
            Iterator<Integer> it = tc.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
        sc.close();
    }
}