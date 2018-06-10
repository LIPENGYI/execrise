package ¹ıÂËÆ÷Ä£Ê½;

public class Client {
	FilterManager filterManager;
	public void setFilterManager(FilterManager filterManager){
		this.filterManager = filterManager;
	}
	public void setRequest(String request){
		filterManager.filterRequest(request);
	}
}
