package trees;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.display();
 // 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false 		
  System.out.println(tree.height());
  tree.preOrder();
  System.out.println("-------------");
  tree.postOrder();
  System.out.println("-------------");
  tree.inOrder();
  System.out.println("-------------");
  tree.levelOrder();
  System.out.println("-------------");
  System.out.println(tree.isBST());
 
  System.out.println(tree.diameter());
  System.out.println(tree.diameterBtr());
  System.out.println(tree.sumLeaf());
	}

}
