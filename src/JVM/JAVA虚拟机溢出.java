package JVM;

import java.util.ArrayList;
import java.util.List;

public class JAVAĞéÄâ»úÒç³ö {
	static class OOMobject{
		
	}
	public static void main(String args[]){
		List<OOMobject> list = new ArrayList<OOMobject>();
		while(true){
			list.add(new OOMobject());
		}
	}
}
