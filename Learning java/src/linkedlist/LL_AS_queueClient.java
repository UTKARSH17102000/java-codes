package linkedlist;

public class LL_AS_queueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LL_AS_Queue queue =new LL_AS_Queue();
		queue.enqueue(10);
		queue.Display();
		
		queue.enqueue(20);
        queue.dequeue();
        queue.Display();
        System.out.println(queue.getFront());

	}

}
