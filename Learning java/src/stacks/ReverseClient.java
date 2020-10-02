package stacks;

public class ReverseClient {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		StackusingArrays stack = new StackusingArrays(5);
		for (int i=1;i<=5;i++)
		{
			stack.push(i*10);
		}
		stack.display();
		StackusingArrays helper = new StackusingArrays(5);
		revrsestack(stack,helper,0);
		stack.display();
		
	}
	public static void revrsestack(StackusingArrays stack,StackusingArrays helper, int index) throws Exception {
		if(stack.isEmpty())
			return ;
		int item = stack.pop();
		revrsestack(stack,helper,index +1);
		
		helper.push(item);
		if(index == 0)
		{
			while(!helper.isEmpty())
			{
				stack.push(helper.pop());
			}
		}
	}

}
