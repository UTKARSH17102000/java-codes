package stacks;

public class QUSDequeueEfficientclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 QUSDequeueEfficientclient queue = new  QUSDequeueEfficientclient();
		 for(int i=1;i<6;i++)
		 {
			 queue.enqueue(i*10);// 10 20 30 40 50
		 }
		 queue.display();//20 30 40 50
		 System.out.println(queue.dequeue());//10
		 queue.display();// 20 30 40 50 
		 System.out.println(queue.Front()); // 20
	}



}
