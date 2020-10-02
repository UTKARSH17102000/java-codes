package trees;
import java.util.*;
public class BinaryTree {
	
	 private class Node {
		int data;
		Node left;
		Node right;
	
		Node(int data,Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	 }
	 Node root;
	 int size ;
	 BinaryTree(){
		 Scanner s = new Scanner(System.in);
		 this.root=takeInput(s,null,false);
	 }
	 private Node takeInput(Scanner s,Node parent,boolean isLeftorRight) {
		 if(parent==null) {
			 System.out.println("Enter the data for root  Node");
		 } else {
			 if(isLeftorRight) {
				 System.out.println("Enter the data for left child"+ parent.data);
				 
			 }else {
				 System.out.println("Enter the data for right child"+ parent.data);
			 }
			 
		 }
		 
		 int nodeData = s.nextInt();
		 Node node = new Node(nodeData,null,null);
		 this.size++;
		 
		 boolean choice = false;
		 System.out.println("Do you Have left child of"+ node.data);
		 choice =s.nextBoolean();
		 if(choice) {
			 node.left = takeInput(s,node,true);
		 }
		  choice = false;
		 System.out.println("Do you Have right child of"+ node.data);
		 choice =s.nextBoolean();
		 if(choice) {
			 node.right = takeInput(s,node,false);
		 }
		 
		 return node;
	 }
	 
	 public void display() {
		 this.display(this.root);
	 }
	 private void display(Node node) {
		 String str ="" ;
		 if (node.left!=null) {
			 str = str +node.left.data+"=>";
		 }else {
			 str = str +"END =>";
		 }
		 str = str +node.data;
		 if(node.right!=null) {
			 str = str+"<="+node.right.data;
		 }else {
			 str = str +"<=END";
		 }
		 System.out.println(str);
		 if(node.left!=null) {
			 this.display(node.left);
		 }
		 if(node.right!=null) {
			 this.display(node.right);
		 }
	 }
	 
	 public int height () {
		 return this.height(this.root);
	 }
	 
	 private int height(Node node) {
		 
		 if(node == null) {
			 return -1;
		 }
		int lheight = this.height(node.left); 
		int rheight = this.height(node.right);
		int height = Math.max(lheight, rheight)+1;
		return height;
	 }
	 
	 public void preOrder() {
		  this.preOrder(this.root);
	 }
	 private void preOrder(Node node) {
		 if(node == null)
			 return; 
		 System.out.print(node.data+",");
		 preOrder(node.left);
		 preOrder(node.right);
	 }
	 
	 public void postOrder() {
		  this.postOrder(this.root);
		  System.out.print("END");
	 }
	 private void postOrder(Node node) {
		 if(node == null)
			 return; 
		 
		 postOrder(node.left);
		 postOrder(node.right);
		 System.out.print(node.data+",");
	 }
	 
	 public void inOrder() {
		  this.inOrder(this.root);
		  System.out.print("END");
	 }
	 private void inOrder(Node node) {
		 if(node == null)
			 return; 
		 
		 inOrder(node.left);
		 System.out.print(node.data+",");
		 inOrder(node.right);
		 
	 }
	 
	 public void levelOrder() {
		 LinkedList<Node> queue  = new LinkedList<>();
		 queue.add(this.root);
		 while(!queue.isEmpty()) {
			 Node rv = queue.removeFirst();
		System.out.print(rv.data+",");
		if(rv.left!=null) {
			queue.addLast(rv.left);
		}
		if(rv.right!=null) {
			queue.addLast(rv.right);
		}
		 }
		 System.out.print("END");
		 
	 }
	 public boolean isBST() {
		 return this.isBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		 
	 }
	 private boolean isBST(Node node , int min, int max) {
		  if(node == null)
			  return true;
		 
		 
		 if(node.data>max || node.data<min)
			 return false;
		 else if(!this.isBST(node.left,min,node.data))
			 return false;
		 else if(!this.isBST(node.right,node.data,max))
			 return false;
		 
		 return true;
		  
		 
	 }
	 
	/*
	 * https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/
       * CODE LINK LNORDER TRAVERSAL WITHOUT USING RECURSION INTRUTIVE APPROACH
	 * 
	 * 
	 * 
	 * class Solution { public List<Integer> inorderTraversal(TreeNode node) {
	 * 
	 * if(node == null){ ArrayList<Integer> list = new ArrayList<>(); return list; }
	 */
/*		         
 *     Stack<TreeNode> stack = new Stack<>();
		       ArrayList<Integer> list = new ArrayList<>();
		       while(true){
		       if(node !=null){
		           stack.push(node);
		           node= node.left;
		       }else{
		           if(stack.isEmpty()){
		               break;
		           }
		           node= stack.pop();
		           list.add(node.val);
		           node= node.right;
		       }
		       }
		       return list;
		    }
		    }
*/
	 
	 
	 public int diameter() {
		 return this.diameter(this.root);
	 }
	 private int diameter(Node node) {
		 if(node == null )
			 return 0;
		 int case1 = this.height(node.left)+this.height(node.right)+2;// when diameter passes through the root node
	      int case2 = this.diameter(node.left);
	      int case3 = this.diameter(node.right);
	      
	      int myans = Math.max(case1 ,Math.max(case2, case3));
	return myans;
	 }
	 
	 public int diameterBtr() {
		 return this.diameterBtr(this.root).diameter;
	 }
	 private DiaPair diameterBtr(Node node ) {
		 if(node == null) {
			 DiaPair bp = new DiaPair(-1 , 0);
			 return bp;
		 }
		 
		 DiaPair lp = this.diameterBtr(node.left);
		 DiaPair rp = this.diameterBtr(node.right);
		 
		 DiaPair mp = new DiaPair();
		 mp.height = Math.max(lp.height, rp.height) + 1;
		 mp.diameter = Math.max(lp.height+rp.height , Math.max(lp.diameter, rp.diameter));
		 
		 return mp;
	 }
	 
	 public class DiaPair {
		 int height ;
		 int diameter ;
		 DiaPair(){
			 
		 }
		 DiaPair(int heigth , int diameter)
		 {
			 this.height= height;
			 this.diameter= diameter;
		 }
	 }
	 
	 public int sumLeaf() {
		 return this.sumLeaf(this.root);
	 }
	 private int sumLeaf(Node node) {
		 
		 if(node == null)
			 return 0;
		 if(node.left == null && node.right == null)
			 return node.data;
		 int lsum = sumLeaf(node.left);
		 int rsum = sumLeaf(node.right);
		 
		 return lsum+ rsum;
	 }
	 
	 
}
