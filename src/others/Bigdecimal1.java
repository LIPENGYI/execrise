package others;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Bigdecimal1 {

	public static void main(String[] args) {
		
		  /*��ʵ�ϣ����ڶ������޷���ȷ�ر�ʾʮ����С��0.1�����Ǳ����������ַ���"0.1"֮��
		  �������ת��8���ֽڵ�doubleֵ����ˣ�������ֻ����һ����ӽ���ֵ������0.1�ˣ�
		  ��0.1000000000000000055511151231257827021181583404541015625��
		  ��ˣ�������ʱ������BigDecimal���캯������������ֵ��0.1000000000000000055511151231257827021181583404541015625��*/
		
//		System.out.println(new BigDecimal(0.1).toString());
//		System.out.println(new BigDecimal("0.1").toString());
		System.out.println(new BigDecimal(
				Double.toString(0.1000000000000000055511151231257827021181583404541015625))
				.toString());
		/*//�ڶ��У�BigDecimal�ܹ���ȷ�ذ��ַ���ת����������ȷ�ĸ�������
		System.out.println(new BigDecimal("0.1").toString());
        �����У���������Double.toString��ʹ��һ���ľ�������������double��Ȼ���������
		Double.toString(0.1000000000000000055511151231257827021181583404541015625)�������ʵ����"0.1"��
		������ɵ�BigDecimal��ʾ����Ҳ��0.1��
		
		System.out.println(new BigDecimal(
		Double.toString(0.1000000000000000055511151231257827021181583404541015625))
		.toString());
		*/
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(3);
		
		BigDecimal loanAmount = new BigDecimal("15000.48");//�������Ҹ�ʽ������ 
		BigDecimal interestRate = new BigDecimal("0.008");
		BigDecimal interest = loanAmount.multiply(interestRate);
		
		System.out.println(currency.format(loanAmount));
		System.out.println(percent.format(interestRate));
		System.out.println("��Ϣ:\t" + currency.format(interest));
		BigDecimal a = new BigDecimal("0.1");
	    BigDecimal b = new BigDecimal(2);
		BigDecimal c = new BigDecimal(0.1);
		int result1 = a.compareTo(b);
	    int result2 = a.compareTo(c);
	    int result3 = b.compareTo(a);
	    //System.out.println(result1);
	    System.out.println(result2);
	    //System.out.println(result3);
	}

}
