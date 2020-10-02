package stackMamLecture;

public class QueueClient {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.display();
		System.out.println(queue.getFront());
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		
		queue.dequeue();
		queue.dequeue();
		
		queue.enqueue(100);
		queue.enqueue(110);
		
	   queue.display();
		

	}

}
