package trees;
 import java.util.ArrayList;
 import java.util.*;
public class GenericTree {
	private class Node {
		int data;
		ArrayList<Node> children;
		Node(int data){
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	private Node root;
	private int size;
	GenericTree(){
		Scanner s = new Scanner (System.in);
		this.root = takeInput(s,null,0);
	}
	private Node takeInput(Scanner s,Node parent,int ithchild) {
		if(parent== null) {
			System.out.println("Enter the Data for the Root Node");
		}else {
			System.out.println("Enter the data for the"+ ithchild+"th child of"+parent.data);
			
		}
		int nodedata = s.nextInt();        // root input
		Node node = new Node(nodedata);
		this.size++;
		System.out.println("Enter the Number of Children for"+node.data);
		int children = s.nextInt();
		for(int i=0;i<children;i++) {        // will be Executed acc. to the value of children
			Node child = this.takeInput(s,node,i);
			node.children.add(child);
		}
		return node;
	}
	 public void display() {
		 this.display(this.root);
	 }
	 private void display(Node node) { // func for one Node 
		 String str = node.data+"=>";
		 for(int i=0;i<node.children.size();i++){
			str = str + node.children.get(i).data+",";
			
		 }
		 str = str +"END";
		 System.out.println(str);
		 // display for every node
		 for(int i=0;i<node.children.size();i++){
				this.display(node.children.get(i));
				
			 }
	 }

}
