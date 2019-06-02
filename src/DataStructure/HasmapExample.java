package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class HasmapExample {

	public static void main(String[] args) {
	
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(200, "Manoj");
		mp.put(300,"Raj");
		mp.put(400,"Suman");
		
		System.out.println(mp);
		
		for(Map.Entry m : mp.entrySet()) {
			System.out.println(m.getKey()+"-----"+m.getValue());
		}
	}

}
