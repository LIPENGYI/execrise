package others;

public class JoinTest {

	public static void main(String[] args) {
		final Thread t1 = new Thread(new Runnable(){
			public void run(){
				System.out.println("t1");			
			}
		});
		final Thread t2 = new Thread(new Runnable(){
			public void run(){
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t2");
			}
		});
		Thread t3 = new Thread(new Runnable(){
			public void run(){
				try {
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t3");
			}
		});
		t2.start();
		t3.start();
		t1.start();
	}

}
