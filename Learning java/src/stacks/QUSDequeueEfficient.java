package stacks;

public class QUSDequeueEfficient {
	
	public DynamicStack primary;
	public DynamicStack secondary;
	
	public  QUSDequeueEfficient() throws Exception
	{
		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();
	}
	public boolean isEmpty() throws Exception
	{
		return this.primary.isEmpty();
		
	}
	public int size() 
	{
		return this.primary.size();
	}
	public void enqueue(int data) throws Exception
	{
		this.primary.push(data);
		while(primary.size() !=0)
		{
			secondary.push(primary.pop());
		}
		primary.push(data);
		while(secondary.size()!= 0)
		{
			primary.push(secondary.pop());
		}
	
	}
	public int  dequeue() throws Exception // O(n) time
	{
		 return this.primary.pop();
		
	}
	public int Front() throws Exception
	{
		return this.primary.top();
	}
	public void display() throws Exception // O(n)
	{
		
		this.primary.display();
	}

}
