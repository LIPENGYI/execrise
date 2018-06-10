package ThreadLoCal;

public class Test11 {

	public static void main(String[] args) {
		System.out.println("主线程ID:"+Thread.currentThread().getId());
		MyThreadd dd = new MyThreadd("lipengyi");
		dd.start();
		MyThreadd ss = new MyThreadd("liqing");
		ss.run();
	}

}
class MyThreadd extends Thread{
	private String name;
	public MyThreadd(String name){
		this.name = name;
	}
	public void run(){
		System.out.println("name:"+name+"子线程ID:"+Thread.currentThread().getId());
	}
}
