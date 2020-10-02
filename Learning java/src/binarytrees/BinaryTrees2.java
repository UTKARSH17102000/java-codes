package binarytrees;
import java.util.*;
public class BinaryTrees2 {

	Scanner scn = new Scanner(System.in);
	
	private class Node  {
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
    
	public BinaryTrees2() {
	root = takeInput(null,false);
	}
	private Node takeInput(Node parent,boolean ilc) {
		//prompt
		if(parent == null) {
			System.out.println("Enter the data for root node ?");
		}else {
			if(ilc) {
				System.out.println("Enter the data for left child of "+parent.data+" ?");
			}else {
				System.out.println("Enter the data for right child of "+parent.data+" ?");
			}
			
		}
		// take input from user
		int item = scn.nextInt();
		// create new node
	    Node nn = new Node();
	    // update the data
	    nn.data=item;
	    // ask user is left child exist
	    System.out.println(nn.data + "has left child ?");
	    
	    boolean  hlc = scn.nextBoolean();
	    // if left child exist then create
	    if(hlc) {
	     nn.left=takeInput(nn,true);
	    }
	    // ask user is right child exists
	    System.out.println(nn.data + "has right child ?");
	    boolean  hrc = scn.nextBoolean();
	    // if right child exists then create 
	    if(hrc) {
	     nn.right=takeInput(nn,false);
	    }
	// return node 
	return nn;
	}
	
  
	public BinaryTrees2(int [] pre,int [] in) {
	root=construct(pre,0,pre.length-1,in,0,in.length-1);
	}
	
	private Node construct(int [] pre ,int plo,int phi,int [] in , int ilo,int ihi)
	{
		
		if(ilo> ihi || plo > phi)
			return null;
		// create new node with plo
		Node nn = new Node();
		nn.data = pre[plo];
		
		// search for pre[plo] int inordr
		int si = -1;
		int nel=0;
		for(int i=ilo;i<=ihi;i++) {
			if(in[i]==pre[plo]) {
				si=i;
		            break;
			}
			nel++;
		}
		
		// left and right child
		
	nn.left=construct(pre,plo+1,plo+nel,in,ilo,si-1);
	nn.right=construct(pre,plo+nel+1,phi,in,si+1,ihi);
		
		return nn;
		
	
	}
	
	
	//O(n)
	public void display() {
		display(root);
	}
   
private void display(Node node) {
	   if(node == null)
		   return;
	   // Self work
	   String str ="";
	   if(node.left==null)
		   str+=".";
	   else
	   str += node.left.data;
	   
	   str+="->"+node.data+"<-";
	   
	   if(node.right==null)
		   str+=".";
	   else
	   str+=node.right.data;
	   
	   System.out.println(str);
	   // Smaller Problem
	   display(node.left);
	   display(node.right);
   }
//O(n)
   public int size() {
	return   size(root);
   }
   private int size(Node node) {
	   
	   if(node == null) {
		   return 1;
	   }
	   int ls = size(node.left);
	   int rs = size(node.right);
	   
	   return ls +rs;
   }
 //O(n)
   public int max() {
		return   max(root);
	   }
	   private int max(Node node) {
		   
		   if(node == null)
			   return Integer.MIN_VALUE;
	     int lm = max(node.left);
	     int rm = max(node.right);
	     
	     return Math.max(node.data, Math.max(lm, rm));
	   }
	 //O(n)
	   public boolean find(int item) {
		   return find(root,item);
	   }
	   private boolean find (Node node , int item) {
		   if( node == null) {
			   return false;
		   }
		   
		   if(node.data == item) {
			   return true;
		   }
		  
		  boolean lf= find(node.left,item);
		  boolean rf= find(node.right,item);
		  
		  return lf || rf;
	   }
	 //O(n)
	   public int ht() {
		   return ht(root);
	   }
	   private int ht(Node node) {
		   if(node == null) {
			   return -1;
		   }
		   int lh = ht(node.left);
		   int rh = ht(node.right);
		   
		  return Math.max(lh, rh)+1;
	   }
	  int diaAns= Integer.MIN_VALUE;
	//O(n^2)
  public int diameter() {
	 diameter(root);
		  return diaAns;
	   }
	   private void diameter(Node node) {
		   
		   if(node == null)
			   return ;
		   int presentNoderoot = ht(node.left)+ht(node.right)+2;
		   if(presentNoderoot>diaAns) {
			   diaAns=presentNoderoot;
		   }
		   diameter(node.left);
		   diameter(node.right);
		   }
	 //O(n^2)
	   public int diameter2() {
		   return diameter2(root);
		   
	   }
	   private int diameter2(Node node) {
		   
		   if(node == null )
			   return 0;
		   // max dist b/w to leaf node might lie in left subtree
		   int ld = diameter2(node.left);

		   
		// max dist b/w to leaf node might lie in right subtree
		   int rd = diameter2(node.right);
		 // self node might be the root node 
		   int sd = ht(node.left)+ht(node.right)+2;
		   return Math.max(sd, Math.max(ld, rd));

	   }
	   
	   
	   private class Diapair {
		   int dia=0;
		   int ht=-1;
	   }
	   public int diameter3() {
		   return  diameter3(root).dia;
		    
	   }
	   private Diapair diameter3(Node node) {
		   
		   if(node == null) {
			   return new Diapair();
		   }
		   Diapair ldp = diameter3(node.left);
		   Diapair rdp = diameter3(node.right);
		   Diapair sdp = new Diapair();
		   
		 
		   int ld = ldp.dia;
		   int rd = rdp.dia;
		 
		   int sd = ldp.ht+rdp.ht+2;
		   sdp.dia= Math.max(sd, Math.max(ld, rd));
		   sdp.ht=Math.max(ldp.ht, rdp.ht)+1;
		   
		   return sdp;
		   
	   }

  public boolean isBalanced() {
	  return isBalanced(root);
  }
  private boolean isBalanced(Node node) {
	  
	  if(node == null ) {
		  return true;
	  }
	  boolean lb = isBalanced(node.left);
	  boolean rb = isBalanced(node.right);
	  int bf = ht(node.left) - ht(node.right);
	  
	  if(lb && rb && bf >= -1 && bf <= 1) {
		  return true;
	  }else {
		  return false;
	  }
  }

  private class BalPair{
	  boolean isBal = true;
	  int ht = -1;
  }
  public boolean isBalanced2() {
	 return isBalanced2(root).isBal;
  }

 private BalPair isBalanced2(Node node) {
	 
	 if(node == null) {
		 return new BalPair();
	 }
	 BalPair lbp = isBalanced2(node.left);
	 BalPair rbp = isBalanced2(node.right);
      
	 BalPair sbp = new BalPair();
	 
	 boolean lb = lbp.isBal;
	  boolean rb = rbp.isBal;
	  int bf = lbp.ht - rbp.ht;
	  
	  if(lb && rb && bf >= -1 && bf <= 1) {
		  sbp.isBal=true;
	  }else {
		  sbp.isBal= false;
	  }
 
  sbp.ht=Math.max(lbp.ht, rbp.ht)+1;
  
  return sbp;
 }

 public boolean FlipEquivalent(BinaryTrees2 other) {
	return  FlipEquivalent(root,other.root);
	 
 }
 
 private boolean FlipEquivalent(Node node1,Node node2) {
	 
	 if(node1 == null && node2 == null)
		 return true;
	 if(node1 == null && node2 != null)
		 return false;
	 if(node1 != null && node2 == null)
		 return false;
	 
	 if(node1.data != node2.data)
		 return false;
	 
	 boolean ll = FlipEquivalent(node1.left,node2.left);
	 boolean rr = FlipEquivalent(node1.right,node2.right);
	 if(ll && rr )
		 return true;
	 boolean lr = FlipEquivalent(node1.left,node2.right);
	 boolean rl = FlipEquivalent(node1.right,node2.left);
	 
	 
	 
	 return (ll && rr) || (lr && rl);
	 
 }
 // NLR is pre order
 // LNR in order
 // LRN post order
 // NRL  reverse pre order
 // RNL reverse in order
 // RLN reverse post order
 
 public void preorder() {
	 preorder(root);
 }
 private void preorder(Node node) {
	 if(node == null)
		 return ;
   //N
   System.out.println(node.data);
   //L
   preorder(node.left);
   // R
   preorder(node.right);
 }
 
 private class Pair{
	 Node node;
	 boolean sd;
	 boolean ld;
	 boolean rd;
	 
 }
 
 public void preorderI() {
	 // create a Stack
	 Stack <Pair> stack = new Stack<>();
	 // create starting Pair
	 Pair sp = new Pair();
	 sp.node=root;
	 // put sp in the stack
	 stack.push(sp);
	 // work till your stack is not empty
	 while(!stack.isEmpty()) {
		 Pair tp = stack.peek();
		 if(tp.node == null) {
			 stack.pop();
			 continue;
		 }
		 
		 if(tp.sd == false) {
			 System.out.println(tp.node.data);
			 tp.sd=true;
		 }else if(tp.ld == false) {
			 Pair np = new Pair();
			 np.node = tp.node.left;
			 // push the new pair into the stack
			if(np.node != null)
			 stack.push(np);
			 // put the ld of tp true
			 tp.ld=true;
		 }else if(tp.rd == false ) {
			 // create new Pair
			 Pair np = new Pair();
			 np.node= tp.node.right;
			 
			 stack.push(np);
			 
			 tp.rd=true;
		 }else {
			 stack.pop();
		 }
	 }
 }
 public int sum() {
	 return sum(root);
 }
 private int sum(Node node) {
	 if(node == null) {
		 return 0;
	 }
	 int ls = sum(node.left);
	 int rs = sum(node.right);
	 return ls +rs +node.data;
	 
 }
  int maxsum = Integer.MIN_VALUE; 
 public int maxSubTreeSum() {
	 maxsubtreesum1(root);
	return maxsum ;
 }
 private int maxsubtreesum1(Node node) {
           if(node == null)
        	   return 0;
	 
	 int ls = maxsubtreesum1(node.left);
	 int rs = maxsubtreesum1(node.right);
	 int nodesum = ls+ rs + node.data;
	 if(nodesum> maxsum) {
		 maxsum= nodesum;
	 }
	 return nodesum;
 }
  // O(n^2)
 public int maxSubTreeSum2() {
  return maxsubtreesum2(root);
}
 private int maxsubtreesum2(Node node) {
	 if(node == null) {
		 return Integer.MIN_VALUE;
	 }
  	
   int leftMaxsubtreesum = maxsubtreesum2(node.left);
   int rightMaxsubtreesum = maxsubtreesum2(node.right);
   
   int selfsum = sum(node);
   
   
   return Math.max(selfsum,Math.max(leftMaxsubtreesum, rightMaxsubtreesum));
   
}
 
 private class maxSubTreeSumPair{
	 int entiresum = 0;
	 int maxsubTreeSum=Integer.MIN_VALUE;
 }
 public int  maxsubtreesum3() {
	 return  maxsubtreesum3(root).maxsubTreeSum;
 }
 private  maxSubTreeSumPair  maxsubtreesum3(Node node) {
	 if(node == null) {
		 return new  maxSubTreeSumPair();
		 
	 }
	 
	 maxSubTreeSumPair lp= maxsubtreesum3(node.left);
	 maxSubTreeSumPair rp= maxsubtreesum3(node.right);
	 
	 maxSubTreeSumPair sp= new maxSubTreeSumPair();
	 
	 sp.entiresum = lp.entiresum + rp.entiresum + node.data;
	 sp.maxsubTreeSum= Math.max(sp.entiresum, Math.max(lp.entiresum, rp.entiresum));
	 
	 return sp;
 }
 

 
}
