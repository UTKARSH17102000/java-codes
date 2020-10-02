package queues;

public class ReverseQueue  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue queue = new DynamicQueue(6);
		for(int i=1;i<6;i++)
		{
			queue.enqueue(i*10);
		}
		ReverseQueue(queue);
		queue.display();
		
		
		

	}
	public static void ReverseQueue(DynamicQueue queue)
	{
		if(queue.isEmpty())
		{
			return ;
		}
		int element = queue.dequeue();
		ReverseQueue(queue);
		queue.enqueue(element);
	}

}
