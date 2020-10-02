package generictrees2part;

public class GenericTreesclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 3 20 2 50 0 60 0 30 0 40 1 70 0
		GenericTrees gt = new GenericTrees();
		gt.display();
		System.out.println(gt.size());
		System.out.println(gt.max());
		System.out.println(gt.find(60));
		System.out.println(gt.height());
	}

}
