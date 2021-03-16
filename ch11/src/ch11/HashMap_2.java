package ch11;

import java.util.*;

public class HashMap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim-java",  90);
		map.put("kim-java", 100);
		map.put("lee-java",  100);
		map.put("kang-java", 80);
		map.put("ahn-java", 90);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		// Call 'key' value & 'value' value
		while(it.hasNext()) {
			//In 'Map interface', 'Entry inner interface' -> Map.Entry
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("Name : " + e.getKey() + ", Score : " + e.getValue());
		}
	}

}
