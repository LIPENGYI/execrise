package LockµÄÊ¹ÓÃ;

public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		MyThread a1 = new MyThread(service);
		MyThread a2 = new MyThread(service);
		MyThread a3 = new MyThread(service);
		System.out.println("begin");
		a1.start();
		a2.start();
		a3.start();
		System.out.println("end");
	}

}
