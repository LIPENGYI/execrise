package ��Ϊ;
/*
 * ��Ŀ����
	����n���ַ��������n���ַ��������ֵ������С�
	��������:
	�����һ��Ϊһ��������n(1��n��1000),����n��Ϊn���ַ���(�ַ������ȡ�100),�ַ�����ֻ���д�Сд��ĸ��
	�������:
	�������n�У�������Ϊ�����ֵ������е��ַ�����
	ʾ��1
	����
	
	9
	cap
	to
	cat
	card
	two
	too
	up
	boat
	boot
	���
	
	boat
	boot
	cap
	card
	cat
	to
	too
	two
	up
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class �ִ����ӵ���󳤶� {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int numbers = reader.nextInt();
		String[] aa = new String[numbers];
		List<String> XX = new ArrayList<String>();
		for(int i=0;i<numbers;i++){
			if(reader.hasNext()){
				aa[i] = reader.next();
				XX.add(aa[i]);
			}
		}
		Collections.sort(XX);
		for(String a:XX){
			System.out.println(a);
		}
	}
}
