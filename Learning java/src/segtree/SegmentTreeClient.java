package segtree;

public class SegmentTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {3,8,7,6,-2,-8,4,9};
		
		SegmentTrees tree = new SegmentTrees(arr);
		tree.display(); 
		
		System.out.println("*****************");
		System.out.println("Sum is "+ tree.query(2, 6));
	
		System.out.println("Sum is "+ tree.query(1, 5));
	   tree.update(3, 14);
	   tree.display();
	}

}
