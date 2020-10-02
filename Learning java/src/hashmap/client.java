package hashmap;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashTable<String,Integer>  map = new HashTable<>(5);
		map.put("USA", 200);
		map.put("UK", 175);
		map.put("INDIA", 300);
		map.put("CHINA", 350);
		System.out.println(map);
		map.put("INDIA", 325);
		map.put("SWEDEN", 100); 
		
		map.display();
	}

}
