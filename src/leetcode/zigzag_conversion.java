package leetcode;
//http://blog.csdn.net/pistolove/article/details/41408021
/**
             （1）通过字符串在每一行出现的顺序，可以其分两个部分：第一行和最后一行，中间行。
	（2）对于第一行和最后一行，由上图可知，具有相同的对应关系。
	（3）对于中间行，前一个下标的值和后一个下标的值需要根据这个下标是该行中的奇数列还是偶数列来计算。
	（4）对已第一行和最后一行，通过规律发现，其对应关系为：start + 2 * 总行数 - 2 ，其中start为该行起始字符在数组的位置。例如第一行开始的start = 0，则后续对
	应位置 为0 + 2 * 5 - 2 = 8，初始start为各行的起始值。同理，对于最后一行，当start = 4时，则后续对应位置为4+ 2 * 5 - 2 = 12，依此类推。
	（5）对于中间行，当列数为奇数时，其对应位置关系为：start + 2 * (总行数 - 当前行 - 1)；当列数为偶数时，其对应关系为：start + 2 * 当前行，其中当前列从0开始 
	。例如，对于第三行的起始start = 3，其后续位置所在列为1，是奇数列，则后续位置为 3 + 2 * （5 - 3 -1）= 5 ，此时start = 5，则其后续位置所在列数为4，是偶数
	列，则后续位置为5 + 2 * 3= 11。       
 * @author Administrator
 *
 */
public class zigzag_conversion {
	public static String convert(String s ,int nRows){
		if(nRows<=0)
			return "";
		if(nRows == 1 || nRows>=s.length())
			return s;
		StringBuffer buffer = new StringBuffer();
		int len = s.length();
		for(int i=0;i<len&&i<nRows;++i){
			int start = i;
			buffer.append(s.charAt(start));
			for(int j =1;start<len;++j){
				if(i==0||i==nRows-1){
					start = start+2*nRows-2;
				}else{
					if(j%2==1){
						start = start+2*(nRows-i-1);
					}else{
						start = start+2*i;
					}
				}
				if(start<len)
					buffer.append(s.charAt(start));
			}
		}
		return buffer.toString();
		
	}
}
