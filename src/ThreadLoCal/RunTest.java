package ThreadLoCal;

public class RunTest {
	public static void main(String[] args) throws InterruptedException{
		MyThread2 myThread = new MyThread2();
		System.out.println("begin=="+myThread.isAlive());
		myThread.start();
		//Thread.sleep(10000);
		System.out.println("end =="+myThread.isAlive());
	}
}
class MyThread2 extends Thread{
	public void run(){
		System.out.println("run="+this.isAlive());
	}
}
