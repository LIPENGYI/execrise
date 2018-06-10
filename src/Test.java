import java.util.*;

class Person{
	public String id;
	
	public String name;
	public Person(String id,String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
public class Test {
	public static void test2(){
		System.out.println("Use String as Key:");
		HashMap<Person,String> hm = new HashMap<Person,String>();
		Person p1 = new Person("111","name1");
		Person p2 = new Person("111","name1");
		hm.put(p1, "address1");
		hm.put(p2, "address1");
		Iterator iter = hm.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry)iter.next();
			Person key = (Person)entry.getKey();
			String val = (String)entry.getValue();
			System.out.println("Key="+key+"   value="+val);
		}
	}
	public static void main(String args[]){
		test2();
	}
}
