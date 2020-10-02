package collectionsframework;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Deque<Integer> deque = new LinkedList<>();
		
		deque.add(1);
		deque.add(2);
		deque.add(3);
		
		System.out.println(deque);
		deque.addFirst(4);
		deque.offerFirst(5);
		
		deque.offerLast(6);
		deque.addLast(8);
		
		System.out.println(deque);
		
		deque.removeFirst();
		deque.removeLast();
		
		System.out.println(deque);
		
		
		System.out.println(deque.pop());
		deque.push(14);
		
		System.out.println(deque);
		
	}

}
