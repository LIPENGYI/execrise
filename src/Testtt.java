
 class Base1 {
	public void f(){
		System.out.println("Base");
	}
}
 class Sub extends Base1{
	 public void f(){
		 System.out.println("Sub");
	 }
 }
public class Testtt{
	public static void main(String[] args){
		try {
			//1 Class c = Class.forName("Sub");
			//2 Class c = Sub.class;
			Sub s = new Sub();
			Class c = s.getClass();
			Base1 b = (Base1)c.newInstance();
			b.f();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}