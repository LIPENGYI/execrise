package ThreadLoCal;
/**
 * ����yield�������õ�ǰ�߳̽���CPUȨ�ޣ���CPUȥִ���������̡߳�����sleep�������ƣ�ͬ�������ͷ�����
 * ����yield���ܿ��ƾ���Ľ���CPU��ʱ�䣬���⣬yield����ֻ����ӵ����ͬ���ȼ����߳��л�ȡCPUִ��ʱ��Ļ��ᡣ
        ע�⣬����yield�������������߳̽�������״̬���������߳��ػؾ���״̬����ֻ��Ҫ�ȴ����»�ȡCPUִ��ʱ�䣬
        ��һ���Ǻ�sleep������һ���ġ�
 * @author Administrator
 *
 */
public class Run{
	public static void main(String[] args){
		MyThread1 t = new MyThread1();
		t.start();
	}
}
 class MyThread1 extends Thread {
	
	public void run(){
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for(int i=0;i<500000;i++){
			count = count+(i+1);
			Thread.yield();
		}
		long endtime = System.currentTimeMillis();
		System.out.println("��ʱ��"+(endtime-beginTime)+"���룡");
	}
}
