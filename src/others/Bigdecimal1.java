package others;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Bigdecimal1 {

	public static void main(String[] args) {
		
		  /*事实上，由于二进制无法精确地表示十进制小数0.1，但是编译器读到字符串"0.1"之后，
		  必须把它转成8个字节的double值，因此，编译器只能用一个最接近的值来代替0.1了，
		  即0.1000000000000000055511151231257827021181583404541015625。
		  因此，在运行时，传给BigDecimal构造函数的真正的数值是0.1000000000000000055511151231257827021181583404541015625。*/
		
//		System.out.println(new BigDecimal(0.1).toString());
//		System.out.println(new BigDecimal("0.1").toString());
		System.out.println(new BigDecimal(
				Double.toString(0.1000000000000000055511151231257827021181583404541015625))
				.toString());
		/*//第二行：BigDecimal能够正确地把字符串转化成真正精确的浮点数。
		System.out.println(new BigDecimal("0.1").toString());
        第三行：问题在于Double.toString会使用一定的精度来四舍五入double，然后再输出。
		Double.toString(0.1000000000000000055511151231257827021181583404541015625)输出的事实上是"0.1"，
		因此生成的BigDecimal表示的数也是0.1。
		
		System.out.println(new BigDecimal(
		Double.toString(0.1000000000000000055511151231257827021181583404541015625))
		.toString());
		*/
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(3);
		
		BigDecimal loanAmount = new BigDecimal("15000.48");//建立货币格式化引用 
		BigDecimal interestRate = new BigDecimal("0.008");
		BigDecimal interest = loanAmount.multiply(interestRate);
		
		System.out.println(currency.format(loanAmount));
		System.out.println(percent.format(interestRate));
		System.out.println("利息:\t" + currency.format(interest));
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
