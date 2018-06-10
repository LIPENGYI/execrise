package leetcode;

public class ¸´Êý³Ë·¨ {
	public String complexNumberMultiply(String a,String b){
		int realA = 0,realB = 0;
		int imagineA = 0,imagineB = 0;
		String arrayA[] = a.split("\\+");
		String arrayB[] = b.split("\\+");
		imagineA = Integer.parseInt(arrayA[1].substring(0, arrayA[1].indexOf('i')));
		imagineB = Integer.parseInt(arrayB[1].substring(0, arrayB[1].indexOf('i')));
		realA = Integer.parseInt(arrayA[0]);
		realB = Integer.parseInt(arrayB[0]);
		
		int newReal = realA*realB - imagineA*imagineB;
		int newImage = realA*imagineB + realB*imagineA;
		
		StringBuilder result = new StringBuilder();
		result.append(newReal).append("+").append(newImage).append('i');
		return result.toString();
		
	}
}
