package ThreadLoCal;

public class MyThread extends Thread {
	private static int num = 0;
	public MyThread(){
		num++;
	}
	@Override
	public void run(){
		System.out.println("主动创建的第"+num+"个县城");
	}
}
