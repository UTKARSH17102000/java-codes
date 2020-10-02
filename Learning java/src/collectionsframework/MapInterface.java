package collectionsframework;

import java.util.HashMap;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(1, "Kevin Hart");
		map.put(2, "Kenny");
		map.put(3, "Tanmay Bhat");
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.containsKey("Kenny"));
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		System.out.println(map.remove(1));
		
		System.out.println(map);
		
		
		
		
		

	}

}
