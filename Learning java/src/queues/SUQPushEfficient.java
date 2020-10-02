package queues;

public class SUQPushEfficient {

	public DynamicQueue primary;
	public DynamicQueue secondary;
	public SUQPushEfficient()
	{
		this.primary= new DynamicQueue();
		this.secondary= new DynamicQueue();
	}
	
	public int size() {
		return this.primary.size();
	}
	public boolean isEmpty()
	{
		return this.primary.isEmpty();
	}
	public void push(int value) throws Exception{
	   this.primary.enqueue();	
	}
	public int pop()  throws Exception{
		while(this.primary.size() !=1)
		{
			secondary.enqueue(this.primary.dequeue);
		}
		int rv = this.primary.dequeue();
		while(this.secondary.size()!=0)
		{
			this.primary.enqueue(this.secondary.dequeue());
		}
		return rv;
	}
	public int top()  throws Exception{
		while(this.primary.size() !=1)
		{
			secondary.enqueue(this.primary.dequeue);
		}
		int rv = this.primary.dequeue();
		this.secondary.enqueue(rv);
		while(this.secondary.size()!=0)
		{
			this.primary.enqueue(this.secondary.dequeue());
		}
		return rv;
		
	}
	public void display() {
			}
}
