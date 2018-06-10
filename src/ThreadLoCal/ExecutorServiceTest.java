package ThreadLoCal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
	private static class Tast implements Runnable{
		
		@Override
		public void run() {
			System.out.println(System.currentTimeMillis()+":Thread ID:"+Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				
			}
		}
		
	}
	public static void main(String[] args) {
		Tast t = new Tast();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i = 0;i<10;i++){
			executorService.execute(t);
		}
		executorService.shutdown();
	}
}
