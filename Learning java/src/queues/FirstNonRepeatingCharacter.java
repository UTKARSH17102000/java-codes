package queues;
 import java.util.*;
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
               char ch = scn.next().charAt(0);
               HashMap <Character,Integer> map = new HashMap<>();
              Queue<Character> queue = new LinkedList<>();
               while(ch!='.')
               {
            	queue.add(ch);
            	if(map.containsKey(ch))
            	{
            		int ov = map.get(ch);
            		ov = ov +1;
            		map.put(ch,ov);
            	}else {
            		map.put(ch, 1);
            		
            	}
            	while(!queue.isEmpty())
            	{
            		char fc = queue.peek();
            		if(map.get(fc)==1)
            		{
            			System.out.println(fc);
            			break;
            		}else {
            			queue.poll();
            		}
            		}
            	if(queue.isEmpty())
            		System.out.println("-1");
            	
            	ch = scn.next().charAt(0);
               }
	}

}
