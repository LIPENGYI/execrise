package leetcode;

public class Z字形变换 {
	public String convert(String s,int numRows){
		if(numRows == 1){
			return s;
		}
		char[][] array = new char[numRows][s.length()];
		boolean flag = true;
		int j = -1;
		int k = 0;
		for(int i=0;i<s.length();i++){
			if(flag&&j<numRows-1){
				j++;
				array[j][k] = s.charAt(i);
				if(j == numRows-1){
					flag = false;
				}
				continue;
			}
			if(!flag&&j>0){
				j--;
				k++;
				array[j][k] = s.charAt(i);
				if(j==0){
					flag = true;
				}
			}
		}
		StringBuilder data = new StringBuilder();
		for(int m = 0;m<numRows;m++){
			for(int n = 0;n<s.length();n++){
				//字符判空的方式
				if(array[m][n] == '\0'){
					data.append(array[m][n]);
				}
			}
		}
		
		return data.toString();
		
	}
}
