package heap;

public class HeapConstructionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HeapConstruction heap = new  HeapConstruction();
		 heap.add(10);
		 heap.display();
		 heap.add(20);
		 heap.display();
		 heap.add(30);
		 heap.display();
		 heap.add(40);
		 heap.display();
		 heap.add(5);
		 heap.display();
		 heap.add(3);
		 heap.display();
		 System.out.println(heap.remove());
		// heap.display();
		 System.out.println(heap.remove());
		// heap.display();
		 System.out.println(heap.remove());
		// heap.display();
		 System.out.println(heap.remove());
		 System.out.println(heap.remove());
		 System.out.println(heap.remove());
	}

}