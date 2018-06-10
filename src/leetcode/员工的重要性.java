package leetcode;

import java.util.HashMap;
import java.util.List;

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
}
public class 员工的重要性 {
	public int getImportance(List<Employee> employees,int id){
		HashMap<Integer,Employee> map = new HashMap<>();
		for(Employee e:employees)
			map.put(e.id, e);
		
		return dfs(id,map);
		
		
	}
	public int dfs(int id,HashMap<Integer,Employee> map){
		Employee e = map.get(id);
		if(e.subordinates.size() == 0){
			return e.importance;
		}
		int imp = e.importance;
		for(int sub:e.subordinates){
			imp += dfs(sub,map);
		}
		return imp;
		
	}
}
