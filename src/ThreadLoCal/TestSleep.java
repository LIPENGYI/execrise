package ThreadLoCal;

public class TestSleep {
	private int i =10;
	private Object object = new Object();
	public static void main(String[] args){
		TestSleep test = new TestSleep();
		MyThread thread1 = test.new MyThread();
		MyThread thread2 = test.new MyThread();
		thread1.start();
		thread2.start();
	}
	class MyThread extends Thread{
		public void run(){
			synchronized(object){
				i++;
				System.out.println("i:"+i);
				try {
					System.out.println("线程"+Thread.currentThread().getName()+"进入睡眠状态");
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("线程"+Thread.currentThread().getName()+"睡眠结束");
				i++;
				System.out.println("i:"+i);
			}
		}
	}
}
