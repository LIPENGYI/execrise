package ǰ�˿�����ģʽ;

public class FrontContrllerPatternDemo {
	public static void main(String[] args){
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
