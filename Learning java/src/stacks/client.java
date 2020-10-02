package stacks;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackusingArrays stack = new StackusingArrays(5);
		for (int i=1;i<=5;i++) {
		stack.push(i*10);
		stack.display();
		}
		System.out.println(stack.top());
		while(!stack.isEmpty()) {
		stack.display();
		stack.pop();
		}
	}

}
