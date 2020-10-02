package binarytrees;

public class BinaryTreesClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 false false 
		// 10 true 20 true 40 true 70 true 90 true 110 false false false false false true 50 false true 80 false true 100 false true 120 false false true 700 false false
		 BinaryTrees2 bt = new  BinaryTrees2();
		 bt.display();
		 System.out.println(bt.size());
		 System.out.println(bt.max());
		 System.out.println(bt.find(60));
		 System.out.println(bt.ht());
		 System.out.println(bt.diameter());
		 System.out.println(bt.diameter2());
		 System.out.println(bt.diameter3());
		 System.out.println(bt.isBalanced());
		 System.out.println(bt.isBalanced2());
		 
		// BinaryTrees2 bt2 = new  BinaryTrees2();
		 
		// bt.FlipEquivalent(bt2);
		 bt.preorderI();
		 System.out.println(bt.maxSubTreeSum());
		 System.out.println(bt.maxSubTreeSum2());
		 System.out.println(bt.maxsubtreesum3());
		 
		 
		 int [] pre = {10,20,40,30,50,60,70};
		 int [] in = {40,20,10,50,30,60,70};
		 BinaryTrees2 bt2 = new  BinaryTrees2(pre,in);
		 bt2.display();
		 
		 
		 
	}

}
