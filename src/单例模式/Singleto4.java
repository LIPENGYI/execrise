package µ¥ÀýÄ£Ê½;

public class Singleto4 {
	private static class SingletonHolder{
		private static final Singleto4 INSTANCE = new Singleto4();
		
	}
	private Singleto4(){
		
	}
	public static final Singleto4 getInstance(){
		return SingletonHolder.INSTANCE;	
	}
}
