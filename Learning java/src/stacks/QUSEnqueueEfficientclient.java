package stacks;

public class QUSEnqueueEfficientclient {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		 QUSEnqueueEfficient queue = new  QUSEnqueueEfficient();
		 
		 for(int i=1;i<6;i++)
		 {
			 queue.enqueue(i*10);
		 }
		 queue.display();
		 System.out.println(queue.dequeue());
		 queue.display();
		 System.out.println(queue.Front());
	}

}
