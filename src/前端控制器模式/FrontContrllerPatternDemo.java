package 前端控制器模式;

public class FrontContrllerPatternDemo {
	public static void main(String[] args){
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
