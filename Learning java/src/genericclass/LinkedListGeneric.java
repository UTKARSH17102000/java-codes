package genericclass;

public class LinkedListGeneric <T>{
   // one class contain only one Public class	
	private class Node{   // if we change private to default then the client can also change the Node class
		T data ;
		Node next;
		
	}
	private Node head;
	private Node tail;
	private int size ;
	
	public int size() {
		return this.size();
	}	
	// O(n)
	public void display()
	{
		Node temp = this.head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	// O(1)
	public void addLast( T item)
	{
		// create new Node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		// attach
		if(this.size >= 1)
		{
			this.tail.next = nn;
		}
		// summary object
		if(this.size == 0)
		{
			this.head = nn;
			this.tail = nn ;
			this.size++;
		}else {
			this.tail = nn;
			this.size++;
		}
		
	}
	// O(1)
	public void addFirst( T item)
	{
		// create new Node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		// attach
		if(this.size >= 1)
		{
			 nn.next=head;
		}
		// summary object
		if(this.size == 0)
		{
			this.head = nn;
			this.tail = nn;
			this.size++;
		}else {
			this.head = nn;
			this.size++;
		}
		
			
	}
	// O(1)
	public T getFirst() throws Exception
	{
		if(this.size == 0)
			throw new Exception("LL is Empty");
		 return this.head.data;
	}
	//O(1)
	public T getLast() throws Exception
	{
		if(this.size == 0)
			throw new Exception("LL is Empty");
		 return this.tail.data;
	}
	// O(n)
	public T getAt( int idx) throws Exception
	{
		if(this.size == 0)
			throw new Exception("LL is Empty"); 
		if( idx <0 || idx>= this.size)
			throw new Exception ("Invalid Index");
	  Node temp = this.head;
	  for(int i=1;i<=idx;i++)
	  {
		  temp = temp.next;
		  
	  }
		return temp.data;	
	}
	// O(n)
	private Node getNodeAt( int idx) throws Exception
	{
		if(this.size == 0)
			throw new Exception("LL is Empty"); 
		if( idx <0 || idx>= this.size)
			throw new Exception ("Invalid Index");
	  Node temp = this.head;
	  for(int i=1;i<=idx;i++)
	  {
		  temp = temp.next;
		  
	  }
		return temp;	
	}
	// O(n)
	public void addAt(T item, int idx) throws Exception

	{
		if(idx< 0 || idx> size){
			throw new Exception ("Invalid Index");
		}
		if(idx == 0) {
			addFirst(item);
		}else if(idx == this.size) {
			addLast(item);
		}else {
			// create
			Node nn = new Node();
			nn.data= item ;
			nn.next = null;
			// attach
			Node nn1 = getNodeAt(idx-1);
			Node np1 = nn1.next;
			nn1.next = nn;
			nn.next =np1;
			// summary update
			this.size++;
		}
	}
     // O(1)
	public T removeFirst() throws Exception {
		
		if(this.size == 0) {
			throw new Exception("LL is empty");
		}
		
		T rv = this.head.data;
		if(this.size == 1)
		{
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}
	// O(n)
	public T removeLast() throws Exception {
		
		if(this.size == 0) {
			throw new Exception("LL is empty");
		}
		
		 T rv = this.tail.data;
		if(this.size == 1)
		{
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sizem2 = getNodeAt(this.size-2);
			this.tail = sizem2;
		    this.tail.next = null;
			this.size--;
		}
		return rv;
	}

  public T removeAt( int idx) throws Exception{
	  
	  if(idx< 0 || idx> size){
			throw new Exception ("Invalid Index");
		}
	  if(this.size == 0) {
			throw new Exception("LL is empty");
		}
	  
	  if(idx == 0)
	  {
		  return removeFirst();
	  }else if (idx == this.size-1)
		  return removeLast();
	  else {
		  Node nm1 = getNodeAt(idx-1);
		  Node n = nm1.next;
		  Node np1 = n.next;
		  nm1.next = np1;
		  this.size--;
		  return n.data;
		  
	  }
  }

  // O(n)
  public void reverseData() throws Exception {
	  int left =0;
	  int right = this.size-1;
	  while(left< right)
	  {
		  Node Ln = getNodeAt(left);
		  Node Rn = getNodeAt(right);
		  
		  T temp = Ln.data;
		  Ln.data = Rn.data;
		  Rn.data= temp;
		  left++;
		  right--;
	  }
  }
 // O(n)
   public void reversrPointer() throws Exception{
	   
	   Node prev = this.head;
	   Node curr = prev.next;
	   
	   while(curr != null)
	   {
		   Node ahead = curr.next;
		   curr.next= prev;
		   
		   prev = curr;
		   curr = ahead;
	   }
	   
	   Node t = this.head;
	   this.head = this.tail;
	   this.tail = t;
	   this.tail.next = null;
   }
 
   // O(n)
    public T mid()
    {
    	Node slow = this.head;
    	Node fast = this.head;
    	
    	while(fast.next != null || fast.next.next != null)
    	{
    		slow = slow.next;
    		fast= fast.next.next;
    	}
    	
    	return slow.data;
    }
  // O(n)
  public T KthNodeFromEnd(int k) throws Exception {
	  
	  Node slow = this.head;
	  Node fast = this.head;
	  if(k<= 0 || k>this.size)
	  {
		  throw new Exception ("invalid idx");
	  }
	  for(int i=1;i<=k;i++)
	  {
		  fast=fast.next;
	  }
	  while(fast.next!=null)
	  {
		  slow=slow.next;
		  fast=fast.next;
	  }
	  return slow.data;
	  
  }
  
  public int  find(T data) {
	  int index = 0;
	  for(Node temp = this.head;temp!=null;temp=temp.next) {
		  if(temp.data.equals(data))
			  return index;
		  
		  index++;
	  }
	  return -1;
  }

}

