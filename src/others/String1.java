package others;

public class String1 {

	public static void main(String[] args) {
		String str1 = "cityu";
		String str2 = new String("cityu");
		String str3 = new String("cityu");
		String str4 = "cityu";
		String str5  = str2;
		//String str3 = "city" +new String("u");
		//System.out.println(str1==str2);
		//System.out.println(str1==str3);
		//System.out.println(str2 == str3);
		//System.out.println(str2.equals(str5));

		//System.out.println(str1.compareTo(anotherString)==str2);
		//System.out.println(str1==str3.intern());
		//System.out.println(str1== str4 );
		
		
		
		/* public boolean equals(Object anObject) {
		        if (this == anObject) {
		            return true;
		        }
		        if (anObject instanceof String) {
		            String anotherString = (String)anObject;
		            int n = value.length;
		            if (n == anotherString.value.length) {
		                char v1[] = value;
		                char v2[] = anotherString.value;
		                int i = 0;
		                while (n-- != 0) {
		                    if (v1[i] != v2[i])
		                        return false;
		                    i++;
		                }
		                return true;
		            }
		        }
		        return false;
		    }
		*/
	}

}
