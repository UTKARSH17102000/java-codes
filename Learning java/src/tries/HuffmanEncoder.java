package tries;

import java.util.HashMap;

public class HuffmanEncoder {
	HashMap<Character,String> encoder;
	HashMap<String,Character> decoder;
	
	public HuffmanEncoder(String feader) {
		HashMap<Character,Integer> fmap = new HashMap<>();
		for(int i=0;i<feader.length();i++) {
			char cc = feader.charAt(i);
			if(fmap.containsKey(cc)) {
				int ov =fmap.get(cc);
				ov = ov +1;
				fmap.put(cc, ov);
			}else {
				fmap.put(cc, 1);
			}
		}
		
		Heap<Node> minHeap = new Heap<>(true);
		
		
	}
	private class Node implements Comparable<Node>{
		Character data;
		int cost;
		Node left;
		Node right;
		
		Node (char data ,int cost){
			this.data=data;
			this.cost=cost;
			this.left=null;
			this.right=null;
		}
		
		public int compareTo(Node o) {
			return this.cost-o.cost;
		}
		
	}

}
