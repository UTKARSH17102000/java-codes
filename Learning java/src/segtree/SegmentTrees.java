package segtree;

public class SegmentTrees {
	private class Node{
		int data;
		int startinterval;
		int endinterval;
		Node left;
		Node right;
	}
	
	Node root;
	
	public SegmentTrees(int [] arr) {
		this.root=constructTree(arr,0,arr.length-1);
	}
	
	private Node constructTree(int [] arr , int si,int ei) {
		if(si==ei) {
			Node leafnode = new Node();
			leafnode.data=arr[si];
			leafnode.startinterval=si;
			leafnode.endinterval=ei;
			return leafnode;
		}
		
		Node node = new Node();
		node.startinterval=si;
		node.endinterval=ei;
		
		int mid = (si+ei)/2;
		node.left=constructTree(arr,si,mid);
		node.right=constructTree(arr,mid +1,ei);
		
		node.data=node.left.data+node.right.data;
		
		return node;
		
	}
	
	public void display() {
		this.display(this.root);
	}
	private void display(Node node) {
		String str="";
		
		if(node.left!=null) {
			str=str+"Interval=["+ node.left.startinterval+"-"+node.left.endinterval+"] and data ="+node.left.data +"=>";
		}else {
			str = str+"No Left child=>";
		}
		str = str +"Interval=["+ node.startinterval+"-"+node.endinterval+"] and data ="+node.data +"=>";
		if(node.right!=null) {
			str=str+"<=data is = "+ node.right.data +"and Interval is ["+ node.right.startinterval+"-"+node.right.endinterval+"]";
		}else {
			str=str+"<= No right Child";
		}
		System.out.println(str);
		if(node.left!=null) {
			this.display(node.left);
		}
		if(node.right!=null) {
			this.display(node.right);
		}
	}
	
	public int query(int qsi,int qei) {
		
		return this.query(this.root, qsi,qei);
	}
	private int query(Node node , int qsi,int qei) {
		if(node.startinterval>=qsi&& node.endinterval<=qei) {
			return node.data;
		}else if(node.startinterval>qei || node.endinterval<qsi) {
			
			return 0;
		}else {
			//overlaping case
			int leftans = this.query(node.left,qsi, qei);
			int rightans = this.query(node.right,qsi, qei);
			return leftans + rightans;
		}
	}
	
	public void update(int index,int newvalue) {
		this.root.data=this.update(this.root,index,newvalue);
	}

	private int update(Node node,int index,int newvalue) {
		if(index>=node.startinterval && index<=node.endinterval ) {
			if(index==node.startinterval && index == node.endinterval) {
				node.data=newvalue;
			}else {
				int leftvalue=this.update(node.left, index, newvalue);
				int rightvalue=this.update(node.right, index, newvalue);
				node.data=leftvalue + rightvalue;
			}
		}
     return node.data;
	}
	
	
}
