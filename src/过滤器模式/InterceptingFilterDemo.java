package ¹ıÂËÆ÷Ä£Ê½;

public class InterceptingFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());
		
		Client client = new Client();
		client.setFilterManager(filterManager);
		client.setRequest("HOME");
	}
}
