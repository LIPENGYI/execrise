package »ªÎª;

import java.math.BigDecimal;
import java.util.Scanner;

public class jinsizhi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigDecimal f = s.nextBigDecimal();
		BigDecimal s1 = f.setScale(0, BigDecimal.ROUND_HALF_UP);
		System.out.println(s1);
	}

}
