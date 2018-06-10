package ThreadLoCal;

public class getId {
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" "+t.getId());
	}
}
