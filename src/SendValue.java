import java.io.UnsupportedEncodingException;

public class SendValue{
    
    public static void main(String[] args) {
       try {
		String a =  new String("����Ҫת�����ַ���".getBytes("GB2312"),"ISO-8859-1");
		 System.out.println(a);
       } catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		double a =0.9239d;
	}finally{
		
	}
    
    }
   
}
