package ��Ϊ;
/*
 * ��Ŀ����
	����:����һ�������������մ�С�����˳����������������������ӣ���180����������Ϊ2 2 3 3 5 ��
	���һ��������ҲҪ�пո�
	
	��ϸ������
	
	�����ӿ�˵����
	public String getResult(long ulDataInput)
	���������
	long ulDataInput�������������
	����ֵ��
	String
	
	
	��������:
	����һ��long������
	�������:
	���մ�С�����˳����������������������ӣ��Կո���������һ��������ҲҪ�пո�
	ʾ��1
	����
	
	180
	���
	
	2 2 3 3 5
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �������� {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long numbers =Long.parseLong(reader.readLine());
		StringBuffer b = new StringBuffer();
		for(int i=2;numbers!=1;i++){
			while(numbers%i==0&&numbers!=1){
				System.out.print(i+" ");
				numbers=numbers/i;
			}
		}
	}
}
