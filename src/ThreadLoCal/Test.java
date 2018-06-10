package ThreadLoCal;

public class Test {

	public static void main(String[] args) {
		MyThread s = new MyThread();
		s.start();
		MyThread x = new MyThread();	
		x.start();

	}

}
/*class MyThread extends Thread{
	private static int num = 0;
	public MyThread(){
		num++;
	}
	@Override
	public void run(){
		System.out.println("创建第"+num+"个县城");
	}
}*/
