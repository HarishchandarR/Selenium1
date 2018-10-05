package week4.class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Babu", 1);
		map.put("Gopi", 2);
		map.put("Gayatri", 3);
		map.put("Koushik", 2);
		map.put("Sarath", 1);
		Set<String> allKeys = map.keySet();
		for (String eachKey : allKeys) {
			System.out.println(eachKey+"-->"+map.get(eachKey));
		}
		for (Entry<String, Integer> each : map.entrySet()) {
			System.out.println(each.getKey()+"-->"+each.getValue());
		}


	}

}
