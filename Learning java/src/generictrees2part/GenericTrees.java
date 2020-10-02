package generictrees2part;

import java.util.ArrayList;
import java.util.Scanner;



public class GenericTrees {

	Scanner scn = new Scanner (System.in);
	
	private class Node {
		int data;
		ArrayList<Node> children  = new ArrayList<>();	
	}

	private Node root;
	
 public GenericTrees(){
	
		root = construct(null,-1);
	}
	private Node construct(Node parent,int ith) {
		//prompt
		if(parent== null) {
			System.out.println("Enter the Data for the Root Node");
		}else {
			System.out.println("Enter the data for the"+ ith+"th child of"+parent.data);
			
		}
		//take input
		int item = scn.nextInt();        // root input
		// create new node
		Node nn = new Node();
		//update the data
		nn.data=item;
		System.out.println("Enter the Number of Children for"+nn.data);
		// take input for number of  children
		int noc = scn.nextInt();
		//loop
		for(int j=0;j<noc;j++) {        // will be Executed acc. to the value of children
			Node child = construct(nn,j);
			nn.children.add(child);
		}
		return nn;
	}
	public void display() {
		System.out.println("*****************************");
		display(root);
		System.out.println("*****************************");
	}
	 private  void display(Node node) {
		String str = node.data+"->";
		for(Node child : node.children) {
			str = str + child.data+" ";
		}
		str = str +".";
		System.out.println(str);
		//smaller problem
		for(Node child:node.children) {
			display(child);
		}
		
	 }
	 
	 public int size() {
		 return size(root);
	 }
	 private int size(Node node) {
		 int ts =0;
		 for(Node child: node.children) {
		 int cs = size(child);
		  ts +=cs;
		 }
		 return ts +1;
	 }
	 
	 public int max() {
		 return max(root);
	 }
	 private int max (Node node) {
		 int tm =node.data;
		 for(Node child: node.children) {
			int cm= max(child);
			if(cm>tm) {
				tm=cm;
			}
		 }
		 return tm;
	 }
	 public boolean find(int item) {
		 return find(root,item);
	 }
	 private boolean find(Node node, int item) {
		 if(node.data == item) {
			 return true;
	 }
		 boolean tf =false;
		 for(Node child:node.children) {
			 boolean cf = find(child,item);
			 if(cf) {
				 return true; // if we return inside loop then other iterations does not work8888888888888888888888888888888  
			 }
		 }
		 return tf;
	 }
	  public int height() {
		  return height(root);
	  }
	  private int height(Node node) {
		  int th =-1;
		  for(Node child:node.children) {
			 int ch= height(child);
			 if(ch>th)
				 th=ch;
		  }
	  return th+1;
	  }
	  
	
}
