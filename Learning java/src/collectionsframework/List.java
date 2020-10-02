package collectionsframework;
import java.util.ArrayList;
import java.util.*;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> arr = new ArrayList();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(2);
	arr.add(4);
		System.out.println(arr);
		System.out.println(arr.contains(1));
		System.out.println(arr.remove(1));
		System.out.println(arr.set(2, 10));
		System.out.println(arr.size());
		System.out.println(arr.indexOf(10));
		System.out.println(arr.lastIndexOf(10));
		System.out.println(arr.subList(0,2));
		System.out.println(arr);
		System.out.println(arr.toString());
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(2, 3);
		System.out.println(list.contains(3));
		System.out.println(list);
		
		LinkedList<Integer> list1 =(LinkedList<Integer>)list.clone();
		System.out.println(list1);
		System.out.println(list.get(2));
		System.out.println(list.getFirst());
		list.addFirst(10);
		list.addLast(10);
		System.out.println(list);
		System.out.println(list.removeFirstOccurrence(10));
		System.out.println(list.removeLastOccurrence(10));
		System.out.println(list);
		System.out.println(list.peek());
		
		
		
		
		
		Vector<Integer> vector = new Vector<>();
		System.out.println();
		vector.ensureCapacity(20);
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		System.out.println(vector.size());
		System.out.println(vector.contains(2));
		
		System.out.println(vector);
		
	ListIterator<Integer>list2=	vector.listIterator();
		while(list2.hasNext()) {
			System.out.println(list2.next());
		}
		
		System.out.println();
		while(list2.hasPrevious()) {
			System.out.println(list2.previous());
		}
		

	}

	

}
 