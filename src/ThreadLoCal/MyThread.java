package ThreadLoCal;

public class MyThread extends Thread {
	private static int num = 0;
	public MyThread(){
		num++;
	}
	@Override
	public void run(){
		System.out.println("���������ĵ�"+num+"���س�");
	}
}
