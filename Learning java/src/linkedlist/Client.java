package linkedlist;

public class Client {

	public static void main(String[] args) throws Exception  {
		
		// TODO Auto-generated method stub
 
		Implementation list = new Implementation(); // Linked list class
		list.addLast(10);
		list.addLast(20);
		list.addFirst(30);
		list.addLast(40);
		list.addFirst(50);
		list.addLast(60);
		list.addAt(5, 2);
		//System.out.println(list.getFirst());
	//	System.out.println(list.getLast());
	//	System.out.println(list.getAt(0));
		System.out.println(list.removeFirst());
         list.display();
	}

}
