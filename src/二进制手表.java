import java.util.ArrayList;
import java.util.List;
/*解法一：轮询遍历法。代码简洁明了，当然，这样的性能并不好。*/
public class 二进制手表 {
	public List<String> readBinaryWatch(int num){
		List<String> times = new ArrayList<>();
		for(int h = 0;h<12;h++){
			for(int m = 0;m<60;m++){
				if(Integer.bitCount(h*64+m) == num)
					times.add(String.format("%d:%02d", h,m));
			}
		}
		return times;
		
	}
}
