package stacks;

public class QUSEnqueueEfficient {
	public DynamicStack primary;
	public DynamicStack secondary;
	
	public QUSEnqueueEfficient() throws Exception
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
	}
	public int  dequeue() throws Exception // O(n) time
	{
		while(primary.size() ==1)
		{
			secondary.push(primary.pop());
		}
		int rv = primary.pop();
		while(!secondary.isEmpty())
		{
			primary.push(secondary.pop());
		}
		return rv;
		
	}
	public int Front() throws Exception
	{
		while(primary.size() ==1)
		{
			secondary.push(primary.pop());
		}
		int rv = primary.top;
		while(!secondary.isEmpty())
		{
			primary.push(secondary.pop());
		}
		return rv;
	}
	public void display() throws Exception // O(n)
	{
		revrsestack(primary,secondary,0);
		primary.display();
	}
	public static void revrsestack ( DynamicStack stack, DynamicStack helper, int index) throws Exception {
		if(stack.isEmpty())
			return ;
		int item = stack.pop();
		revrsestack(stack,helper,index +1);
		
		helper.push(item);
		if(index == 0)
		{
			while(!helper.isEmpty())
			{
				stack.push(helper.pop());
			}
		}
	}


}
