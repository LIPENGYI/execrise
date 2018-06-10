package ThreadLoCal;

public class TestThread6 {
	public static void main(String args[]){
		MyThread4 t4 = new MyThread4();
		MyThread5 t5 = new MyThread5();
		Thread t1  = new Thread(t4);
		Thread t2 = new Thread(t5);
		t1.setPriority(Thread.NORM_PRIORITY+3);
		t1.start();
		t2.start();
	}
	
}
class MyThread4 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<=1000;i++){
			System.out.println("T1:"+i);
		}
	}
	
}
class MyThread5 implements Runnable{
	public void run(){
		for(int i = 0;i<=1000;i++){
			System.out.println("T2:"+i);
		}
	}
}