package ThreadLoCal;

public class Tes2 {
	public static void main(String[] args) {
		System.out.println("主线程ID:"+Thread.currentThread().getId());
		MyRunnable s = new MyRunnable();
		Thread n = new Thread(s);
		n.start();
	}
}
class MyRunnable implements Runnable{
	public MyRunnable(){
		
	}
	@Override
	public void run() {
		System.out.println("子线程ID:"+Thread.currentThread().getId());
	}
	
}
