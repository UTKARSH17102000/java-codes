package collectionsframework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		
		System.out.println(queue.offer(8));
		System.out.println(queue);
		
		System.out.println(queue.element());
		System.out.println(queue);
		
		System.out.println("***********************************");
		
		
		
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack.empty());
		
		System.out.println(stack.search(6));
		
		System.out.println(stack.peek());
		
		
		
		
		
	}

}
