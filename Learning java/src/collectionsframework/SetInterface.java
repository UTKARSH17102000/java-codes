package collectionsframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		HashSet<Integer> set = new HashSet<>();
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(5);
		
		System.out.println(set.add(1));
		
		System.out.println(set.size());
		System.out.println(set.contains(4));
		System.out.println(set.isEmpty());
		
		Iterator<Integer> iterator  = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("***********************************");
		
		
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		// all properties are same as hash set
		
		
		TreeSet<Integer> treeset= new TreeSet<>();
		
		treeset.add(5);
		treeset.add(6);
		treeset.add(1);
		
		SortedSet set2 = treeset.headSet(6, true);
		System.out.println(set2);
	
		SortedSet set3 =treeset.tailSet(5, true);
		System.out.println(set3);
		System.out.println(treeset);
		System.out.println(treeset.pollFirst());
		System.out.println(treeset.pollLast());
		System.out.println(treeset);
		
	}

}
