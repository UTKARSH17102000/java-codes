package stackMamLecture;

import java.util.ArrayList;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 Stack s = new Stack();
		 s.push(10);
		 s.push(20);
		 s.push(30);
		 s.push(40);
		 
		 s.push(50);
		// s.push(60);
		 
		 s.display();
		 System.out.println(s.peek());
		 
		 System.out.println(s.isFull());
		 System.out.println(s.isEmpty());
		 
		 ArrayList<Integer> list = new ArrayList<Integer>(3);
		 
		
		 
		 
		

	}

}
