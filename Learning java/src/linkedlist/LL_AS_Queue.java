package linkedlist;

public class LL_AS_Queue {
	private Implementation queue ;
	public LL_AS_Queue() {
		this.queue = new Implementation();
	}
	public int size() {
		return this.queue.size();
	}
	 
	 public void enqueue(int data)
	 {
		 this.queue.addLast(data);
	
	 }
	 public int dequeue() throws Exception
	 {
      return this.queue.removeFirst();	
	 }
	 public int getFront() throws Exception
	 {
		return queue.getFirst();
	 }
	 
	 public void Display() {
		 this.queue.display();
		 
	 }
}
