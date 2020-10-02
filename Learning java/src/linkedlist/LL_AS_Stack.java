package linkedlist;

public class LL_AS_Stack {
	private Implementation stack;
	public  LL_AS_Stack() {
		this.stack = new Implementation();
	}
	public int size() {
		return this.stack.size();
	}
	public void push(int data) throws Exception{
		 this.stack.addFirst(data);
	}
	public int pop()  throws Exception{
		return this.stack.removeFirst();	
	}
	public int top()  throws Exception{
		return stack.getFirst();
	}
	public void display() {
		 this.stack.display();
    
	}

}
