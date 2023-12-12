package Demo;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		HashMap<Integer, String> data = new HashMap<>();
		data.put(1, "Doraemon");
		data.put(2, "Nobita");
		data.put(3, "Shizuka");
		data.put(4, "Gian");
		data.put(null, "Suneo");
		
		System.out.println(data);
		System.out.println(data.get(1)); 
		System.out.println(data.get(null));
				
	}
}
