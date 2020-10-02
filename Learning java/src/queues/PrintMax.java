package queues;
import java.util.*;
public class PrintMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n =scn.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =scn.nextInt();
			}
		int k = scn.nextInt();
		printMax(arr,k);
		

	}
	public static void printMax(int [] arr , int k)
	{
		Deque<Integer> q = new LinkedList<>();
		int i;
		for(i=0;i<k;i++)
		{
			while(!q.isEmpty() && arr[i] >arr[q.getLast()])
			{
				q.removeLast();
			}
			q.addLast(i);
		}
		for(;i<arr.length;i++)
		{
			System.out.print(arr[q.getFirst()]+" ");
			
			while(!q.isEmpty() && q.getFirst()<=i-k)
			{
				q.removeFirst();
			}
			while(!q.isEmpty() && arr[i]>arr[q.getLast()])
			{
				q.removeLast();
			}
			q.addLast(i);
			
		}
		System.out.print(arr[q.getFirst()]+" ");
		
	}

}
