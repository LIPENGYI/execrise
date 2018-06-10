package leetcode;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {
	public static void main(String[] args){
		CyclicBarrier barrier = new CyclicBarrier(3);
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(new Thread(new Runner1(barrier,"1号线手")));
		executor.submit(new Thread(new Runner1(barrier,"2号选手")));
		executor.submit(new Thread(new Runner1(barrier,"3号选手")));
		executor.shutdown();
	}
}
class Runner1 implements Runnable{
	
	private CyclicBarrier barrier;
	private String name;
	public Runner1(CyclicBarrier barrier,String name){
		super();
		this.barrier = barrier;
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000*(new Random()).nextInt(8));
			System.out.println(name+"准备好了。。。");
			barrier.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"起跑！");
	}	
}
